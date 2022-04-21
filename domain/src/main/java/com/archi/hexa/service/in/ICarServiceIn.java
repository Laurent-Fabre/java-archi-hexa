package com.archi.hexa.service.in;

import com.archi.hexa.model.Car;

import java.util.List;

/**
 * Interface call by the provider Out (Controller, ...)
 */
public interface ICarServiceIn {

    List<Car> getAllCars();

    Car createCar(Car car);

    Car updateCar(Long carId, Car car);

    Car getCarById(Long carId);

    void deleteCar(Long carId);
}
