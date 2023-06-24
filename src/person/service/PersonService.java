package person.service;

import person.model.Person;

import java.util.List;

public interface PersonService {
    //        Person
        void savePerson(Person person);
        List<Person> getAllPerson();
        Person getPersonByName(String firsName);
        Person getPersonById(Long id);
        Person updatePersonById(Long id, Person person);
        String deletePersonById(Long id);// - Адам очсо бардык нерсе очот
}
