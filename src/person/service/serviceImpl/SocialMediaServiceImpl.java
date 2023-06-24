package person.service.serviceImpl;

import person.dataBase.DataBase;
import person.model.Person;
import person.model.SocialMedia;
import person.service.SocialMediaService;

import java.util.List;

public class SocialMediaServiceImpl implements SocialMediaService {

    private final DataBase dataBase = new DataBase();
    private final PersonServiceImpl personService = new PersonServiceImpl();


    @Override
    public void assignSocialMediaToPerson(Long idPerson, Long id) {
        for (Person person: dataBase.getPersonList()){
            if (person.getId().equals(idPerson)){
                for (SocialMedia socialMedia: dataBase.getSocialMedia()){
                    if (socialMedia.getId().equals(id)){
                        person.getSocialMedia().add(socialMedia);
                    }
                }
            }
        }
    }

    @Override
    public String saveSocialMedia(SocialMedia socialMedia) {
        dataBase.getSocialMedia().add(socialMedia);
        return "Успешно ддобавлен";
    }

    @Override
    public SocialMedia getSocialMediaById(Long id) {
        SocialMedia socialMedia1 = null;
        for (SocialMedia socialMedia: dataBase.getSocialMedia()){
            if (socialMedia.getId().equals(id)){
                socialMedia1=socialMedia;
            }
        }
        return socialMedia1;
    }

    @Override
    public List<SocialMedia> getAllSocialMediaByPersonId(Long personId) {
        for (Person person: dataBase.getPersonList()){
            if (person.getId().equals(personId)){
                return person.getSocialMedia();
            }
        }
        return null;
    }

    @Override
    public void deleteAllSocialMediaByPersonId(Long id) {
        Person personById = personService.getPersonById(id);
        personById.getSocialMedia().clear();
    }

    @Override
    public void deleteSocialMediaById(Long id) {
        dataBase.getSocialMedia().remove(getSocialMediaById(id));
    }
}
