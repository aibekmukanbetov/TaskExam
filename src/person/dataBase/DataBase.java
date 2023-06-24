package person.dataBase;

import person.model.Car;
import person.model.Person;
import person.model.SocialMedia;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Person> personList = new ArrayList<>();
    private List<SocialMedia> socialMedia = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();


    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public List<SocialMedia> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<SocialMedia> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
