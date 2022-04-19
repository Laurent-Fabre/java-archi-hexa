package com.archi.hexa.service.in;

import com.archi.hexa.model.Car;

import java.util.List;
import java.util.Optional;

/**
 * Interface call by the provider In (Database, ...)
 */
public interface ICarServiceIn {

    List<Car> getAllCars();

    Car createCar(Car car);

    Car updateCar(Long carId, Car car);

    Optional<Car> findCarById(Long carId);

    void deleteCar(Long carId);
}
