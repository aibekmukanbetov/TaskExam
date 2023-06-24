package person.service;

import person.model.Person;
import person.model.SocialMedia;

import java.util.List;

public interface SocialMediaService {
//    2. Social Media
    void assignSocialMediaToPerson(Long idPerson, Long id);
    String saveSocialMedia(SocialMedia socialMedia);
    SocialMedia getSocialMediaById(Long id);
    List<SocialMedia> getAllSocialMediaByPersonId(Long personId);
    void deleteAllSocialMediaByPersonId(Long id);//- Адамдын бардык Social media сы очсун, адам очпосун
    void deleteSocialMediaById(Long id);//:- Адамдын бир эле social media сы очот, адам очпойт
}
