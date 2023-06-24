package person.model;

import java.util.ArrayList;
import java.util.List;

//Task-3 for exam
//        Person(id, firstName, LastName, age,email)
//- Адамдын бир эле машинасы сы очот, адам очпойт
//        Бир Адамдын коп social media сы бар, бир social media коп адамда боло алат
//        Бир адамдын коп машинасы боло алат, бир машина бир эле адамга тиешелуу боло алат
public class Person {
    private static Long counter= 1L;
    private Long id;
    private  String firsName;
    private  String lastName;
    private int age;
    private String email;
    private List<SocialMedia> socialMedia = new ArrayList<>();
    private  List<Car> cars= new ArrayList<>();


    public Person(String firsName, String lastName, int age, String email) {
        this.id=counter++;
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public Person(String firsName, String lastName, int age, String email, List<SocialMedia> socialMedia, List<Car> cars) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.socialMedia = socialMedia;
        this.cars = cars;
    }

    public static Long getCounter() {
        return counter;
    }

    public static void setCounter(Long counter) {
        Person.counter = counter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", socialMedia=" + socialMedia +
                ", cars=" + cars +
                '}';
    }
}
