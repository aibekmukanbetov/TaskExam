package person.service.serviceImpl;

import person.dataBase.DataBase;
import person.model.Person;
import person.service.PersonService;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {
    private final DataBase dataBase = new DataBase();

    public DataBase getDataBase() {
        return dataBase;
    }


    @Override
    public void savePerson(Person person) {
        dataBase.getPersonList().add(person);
    }

    @Override
    public List<Person> getAllPerson() {
        return dataBase.getPersonList();
    }

    @Override
    public Person getPersonByName(String firsName) {
        Person person1 = null;
        for (Person person : dataBase.getPersonList()) {
            if (person.getFirsName().equalsIgnoreCase(firsName)) {
                person1 = person;
            }
        }
        return person1;
    }
    @Override
    public Person getPersonById(Long id) {
        Person person = null;
        for (Person person1 : dataBase.getPersonList()) {
            if (person1.getId().equals(id)) {
                person = person1;
            }
        }
        return person;
    }

    @Override
    public Person updatePersonById(Long id, Person person) {
        Person person1 = getPersonById(id);
        person1.setFirsName(person.getFirsName());
        person1.setLastName(person.getLastName());
        person1.setAge(person.getAge());
        person1.setEmail(person.getEmail());
        return person1;
    }

    @Override
    public String deletePersonById(Long id) {
        Person person = getPersonById(id);
        dataBase.getPersonList().remove(person);
        return "Успешно удален";
    }


}
