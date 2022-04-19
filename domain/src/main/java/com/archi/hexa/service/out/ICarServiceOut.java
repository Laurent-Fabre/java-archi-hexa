package com.archi.hexa.service.out;

import com.archi.hexa.model.Car;

import java.util.List;

/**
 * Interface call by the provider Out (Controller, ...)
 */
public interface ICarServiceOut {

    List<Car> getAllCars();

    Car createCar(Car car);

    Car updateCar(Long carId, Car car);

    Car getCarById(Long carId);

    void deleteCar(Long carId);
}
