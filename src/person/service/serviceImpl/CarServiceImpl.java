package person.service.serviceImpl;


import person.model.Car;
import person.model.Person;
import person.service.CarService;


import java.util.List;

public class CarServiceImpl implements CarService {

    private PersonServiceImpl personService;

    public CarServiceImpl(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @Override
    public void saveCar(Long id, Car car) {
        Person personById = personService.getPersonById(id);
        personById.getCars().add(car);
    }

    @Override
    public List<Car> getCarByPersonId(Long id) {
        Person person = personService.getPersonById(id);
        return person.getCars();
    }

    @Override
    public Car getCarById(Long idCar){
        Car car1 = null;
        for (Person person: personService.getAllPerson()){
            for (Car car: person.getCars()){
                if (car.getId().equals(idCar)){
                    car1=car;
                }
            }
        }
        return car1;
    }

    @Override
    public void updateCarById(Long id, Car car) {
        Car car1 = getCarById(id);
        car1.setName(car.getName());
        car1.setYear(car.getYear());
    }

    @Override
    public String deleteCarById(Long id) {
        for (Person person: personService.getAllPerson()){
            person.getCars().remove(getCarById(id));
        }
        return "Успешно удален";
    }
}
