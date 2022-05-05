package com.archi.hexa.database;

import com.archi.hexa.database.mapper.CarEntityMapper;
import com.archi.hexa.database.repositories.CarRepository;
import com.archi.hexa.model.Car;
import com.archi.hexa.service.out.ICarServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DataBaseCarProvider implements ICarServiceOut {
    private final CarRepository carRepository;
    private final CarEntityMapper carMapper;

    @Override
    public List<Car> getAllCars() {
        return this.carMapper.lstCarEntitiesToLstCars(this.carRepository.findAll());
    }

    @Override
    public Car createCar(Car car) {
        return this.carMapper.carEntityToCar(this.carRepository.save(this.carMapper.carToCarEntity(car)));
    }

    @Override
    public Car updateCar(Long carId, Car car) {
        return null;
    }

    @Override
    public Optional<Car> findCarById(Long carId) {
        return this.carRepository.findById(carId)
                .map(this.carMapper::carEntityToCar);
    }

    @Override
    public void deleteCar(Long carId) {
        this.carRepository.deleteById(carId);
    }
}
