package com.archi.hexa.service.out;

import com.archi.hexa.model.Car;

import java.util.List;
import java.util.Optional;

/**
 * Interface call by the provider In (Database, ...)
 */
public interface ICarServiceOut {

    List<Car> getAllCars();

    Car createCar(Car car);

    Car updateCar(Long carId, Car car);

    Optional<Car> findCarById(Long carId);

    void deleteCar(Long carId);
}
