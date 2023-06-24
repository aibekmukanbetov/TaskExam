package person.service.serviceImpl;

import person.dataBase.DataBase;
import person.model.Car;
import person.model.Person;
import person.service.CarService;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private final  DataBase dataBase = new DataBase();
    private final PersonServiceImpl personService = new PersonServiceImpl();

    @Override
    public void saveCar(Long id, Car car) {
        for (Person person: dataBase.getPersonList()){
            if (person.getId().equals(id)){
                person.getCars().add(car);
            }
        }
    }

    @Override
    public List<Car> getCarByPersonId(Long id) {
        Person person = personService.getPersonById(id);
        return person.getCars();
    }

    @Override
    public Car getCarById(Long idCar){
        Car car1 = null;
        for (Person person: dataBase.getPersonList()){
            for (Car car: person.getCars()){
                if (car.getId()==idCar){
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
        for (Person person: dataBase.getPersonList()){
            person.getCars().remove(getCarById(id));
        }
        return "Успешно удален";
    }
}
