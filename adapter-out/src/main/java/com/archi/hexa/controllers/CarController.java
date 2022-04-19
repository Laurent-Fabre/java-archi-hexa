package com.archi.hexa.controllers;

import com.archi.hexa.mapper.CarDTOMapper;
import com.archi.hexa.dto.CarDTO;
import lombok.RequiredArgsConstructor;
import com.archi.hexa.model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.archi.hexa.service.out.ICarServiceOut;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {
    private final ICarServiceOut carService;
    private final CarDTOMapper carMapper;

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public List<CarDTO> getAllCars() {
        return this.carMapper.lstCarsToLstCarsDTO(this.carService.getAllCars());
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public CarDTO getCarById(@PathVariable Long id) {
        final Car car = this.carService.getCarById(id);
        return this.carMapper.carToCarDTO(car);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    @ResponseBody
    public CarDTO createCar(CarDTO pCarDTO) {
        final Car car = this.carService.createCar(this.carMapper.carDTOToCar(pCarDTO));
        return this.carMapper.carToCarDTO(car);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public CarDTO updateCar(@PathVariable Long id, @RequestBody CarDTO carDTO) {
        if (id != null) {
            final Car car = this.carService.updateCar(id, this.carMapper.carDTOToCar(carDTO));
            return this.carMapper.carToCarDTO(car);
        } else {
            throw new RuntimeException("Id cannot be null");
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public String deleteCar(@PathVariable Long id) {
        if (id != null) {
            this.carService.deleteCar(id);
            return "Car removed";
        } else {
            throw new RuntimeException("Id cannot be null");
        }
    }

}
