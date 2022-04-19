package com.archi.hexa.mapper;

import com.archi.hexa.dto.CarDTO;
import com.archi.hexa.model.Car;
import org.mapstruct.Mapper;

import java.util.List;

/** Interface that represents the {@link CarDTO} mapper. */
@Mapper(componentModel = "spring")
public interface CarDTOMapper {

    Car carDTOToCar(CarDTO carDTO);

    CarDTO carToCarDTO(Car car);

    List<CarDTO> lstCarsToLstCarsDTO(List<Car> lstCars);
}
