package person;


import person.model.Car;
import person.model.Person;
import person.model.SocialMedia;

import person.service.serviceImpl.CarServiceImpl;
import person.service.serviceImpl.PersonServiceImpl;
import person.service.serviceImpl.SocialMediaServiceImpl;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonServiceImpl personService = new PersonServiceImpl();
        SocialMediaServiceImpl socialMediaService = new SocialMediaServiceImpl(personService);
        CarServiceImpl carService = new CarServiceImpl(personService);

        int n;
        do {
            System.out.println("1. savePerson");
            System.out.println("2. getAllPerson");
            System.out.println("3. getPersonByName");
            System.out.println("4. getPersonById");
            System.out.println("5. updatePersonById");
            System.out.println("6. deletePersonById");
            System.out.println("7. saveSocialMedia");
            System.out.println("8. assignSocialMediaToPerson");
            System.out.println("9. getSocialMediaById");
            System.out.println("10. getAllSocialMediaByPersonId");
            System.out.println("11. deleteAllSocialMediaByPersonId");
            System.out.println("12. deleteSocialMediaById");
            System.out.println("13. saveCar");
            System.out.println("14. getCarByPersonId");
            System.out.println("15. getCarById");
            System.out.println("16. updateCarById");
            System.out.println("17. deleteCarById");
            System.out.println("18. EXIT");
            Scanner scanner = new Scanner(System.in);
            n= scanner.nextInt();
            switch (n){
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Введите имя человека: ");
                    String firstName = scanner1.nextLine();
                    System.out.println("Введите фамилию человека: ");
                    String lastName = scanner1.nextLine();
                    System.out.println("Введите возраст человека: ");
                    Scanner scanner2= new Scanner(System.in);
                    int age = scanner2.nextInt();
                    System.out.println("Введите почту человека: ");
                    String email = scanner1.nextLine();
                    personService.savePerson(new Person(firstName, lastName, age, email));
                    break;
                case 2:
                    System.out.println(personService.getAllPerson());
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Введите имя человека: ");
                    String name = scanner3.nextLine();
                    System.out.println(personService.getPersonByName(name));
                    break;
                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Введите id человека: ");
                    Long idP = scanner4.nextLong();
                    System.out.println(personService.getPersonById(idP));
                    break;
                case 5:
                    System.out.println("Введите id человека которого хотите изменить: ");
                    Scanner scanner5 = new Scanner(System.in);
                    Long pId = scanner5.nextLong();
                    Scanner scanner6 = new Scanner(System.in);
                    System.out.println("Введите имя человека: ");
                    String newFirstName = scanner6.nextLine();
                    System.out.println("Введите фамилию человека: ");
                    String newLastName = scanner6.nextLine();
                    System.out.println("Введите возраст человека: ");
                    Scanner scanner7= new Scanner(System.in);
                    int newAge = scanner7.nextInt();
                    System.out.println("Введите почту человека: ");
                    String newEmail = scanner6.nextLine();
                    System.out.println(personService.updatePersonById(pId, new Person(newFirstName, newLastName, newAge, newEmail)));
                    break;
                case 6:
                    Scanner scanner8 = new Scanner(System.in);
                    System.out.println("Введите id человека для удаления ");
                    Long idD = scanner8.nextLong();
                    System.out.println(personService.deletePersonById(idD));
                    break;
                case 7:
                    System.out.println("Введите название Social Media: ");
                    Scanner scanner9 = new Scanner(System.in);
                    String nameSocial = scanner9.nextLine();
                    System.out.println(socialMediaService.saveSocialMedia(new SocialMedia(nameSocial)));
                    break;
                case 8:
                    System.out.println("Введите id человека куда хотите добавить: ");
                    Scanner scanner10 = new Scanner(System.in);
                    Long perId = scanner10.nextLong();
                    System.out.println("Введите id social media которого хотите добавить: ");
                    Scanner scanner11 = new Scanner(System.in);
                    Long idSocial = scanner11.nextLong();
                    socialMediaService.assignSocialMediaToPerson(perId, idSocial);
                    break;
                case 9:
                    Scanner scanner12 = new Scanner(System.in);
                    System.out.println("Введите id social media: ");
                    Long socialId = scanner12.nextLong();
                    System.out.println(socialMediaService.getSocialMediaById(socialId));
                    break;
                case 10:
                    System.out.println("Введите id человека: ");
                    Scanner scanner13 = new Scanner(System.in);
                    Long personId = scanner13.nextLong();
                    System.out.println(socialMediaService.getAllSocialMediaByPersonId(personId));
                    break;
                case 11:
                    System.out.println("Введите id social media: ");
                    Scanner scanner14 = new Scanner(System.in);
                    Long sId = scanner14.nextLong();
                    socialMediaService.deleteAllSocialMediaByPersonId(sId);
                    break;
                case 12:
                    System.out.println("Введите id social media: ");
                    Scanner scanner15 = new Scanner(System.in);
                    Long socId = scanner15.nextLong();
                    socialMediaService.deleteSocialMediaById(socId);
                    break;
                case 13:
                    System.out.println("Введите id Человека куда хотите добавить: ");
                    Scanner scanner16 = new Scanner(System.in);
                    Long persId = scanner16.nextLong();
                    System.out.println("Введите название car: ");
                    Scanner scanner25 = new Scanner(System.in);
                    String nameCar = scanner25.nextLine();
                    System.out.println("Введите год car: ");
                    Scanner scanner18 = new Scanner(System.in);
                    int year = scanner18.nextInt();
                    carService.saveCar(persId, new Car(nameCar, year));
                    break;
                case 14:
                    System.out.println("Введите id человека: ");
                    Scanner scanner19 = new Scanner(System.in);
                    Long persoId = scanner19.nextLong();
                    System.out.println(carService.getCarByPersonId(persoId));
                    break;
                case 15:
                    System.out.println("Введите id car: ");
                    Scanner scanner20 = new Scanner(System.in);
                    Long carId = scanner20.nextLong();
                    System.out.println(carService.getCarById(carId));
                    break;
                case 16:
                    System.out.println("Введите id car");
                    Scanner scanner21 = new Scanner(System.in);
                    Long cId = scanner21.nextLong();
                    System.out.println("Введите новое название car: ");
                    Scanner scanner22= new Scanner(System.in);
                    String newName = scanner22.nextLine();
                    System.out.println("Введите год car: ");
                    Scanner scanner23 = new Scanner(System.in);
                    int newYear = scanner23.nextInt();
                    carService.updateCarById(cId, new Car(newName, newYear));
                    break;
                case 17:
                    System.out.println("Введите id car: ");
                    Scanner scanner24 = new Scanner(System.in);
                    Long idC = scanner24.nextLong();
                    System.out.println(carService.deleteCarById(idC));
                    break;
                case 18:
                    System.out.println("EXIT");
                    break;
            }
        }while (n!=18);
    }
}
