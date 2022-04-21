package com.archi.hexa.service.in.impl;

import com.archi.hexa.model.Car;
import com.archi.hexa.service.in.ICarServiceIn;
import com.archi.hexa.service.out.ICarServiceOut;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CarServiceIn implements ICarServiceIn {

    private final ICarServiceOut carServiceIn;

    @Override
    public List<Car> getAllCars() {
        return this.carServiceIn.getAllCars();
    }

    @Override
    public Car createCar(Car car) {
        return this.carServiceIn.createCar(car);
    }

    @Override
    public Car updateCar(Long carId, Car car) {
        return this.carServiceIn.updateCar(carId, car);
    }

    @Override
    public Car getCarById(Long carId) {
        return this.carServiceIn.findCarById(carId)
                .orElseThrow(() -> new RuntimeException(String.format("No car has been found for id %d", carId)));
    }

    @Override
    public void deleteCar(Long carId) {
        this.carServiceIn.findCarById(carId)
                .ifPresentOrElse(
                        (car) -> this.carServiceIn.deleteCar(car.getId()),
                        () -> {
                            throw new RuntimeException(String.format("No car has been found for id %d", carId));
                        }
                );
    }
}
