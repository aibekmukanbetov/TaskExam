package person.service;

import person.model.Car;

import java.util.List;

public interface CarService {
//    3. Car
    void saveCar(Long id, Car car);//- машина Person го тиешелуу болуп сакталсын
    List<Car> getCarByPersonId(Long id);
    Car getCarById(Long idCar);
    void updateCarById(Long id, Car car);
    String deleteCarById(Long id);
//    - Адамдын бир эле машинасы сы очот, адам очпойт
//    Бир Адамдын коп social media сы бар, бир social media коп адамда боло алат
//    Бир адамдын коп машинасы боло алат, бир машина бир эле адамга тиешелуу боло алат
}
