package com.archi.hexa.database.mapper;

import com.archi.hexa.database.entities.CarEntity;
import com.archi.hexa.model.Car;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Interface that represents the {@link CarEntity} mapper.
 */
@Mapper(componentModel = "spring")
public interface CarEntityMapper {

    Car carEntityToCar(CarEntity carEntity);

    CarEntity carToCarEntity(Car car);

    List<Car> lstCarEntitiesToLstCars(List<CarEntity> lstCarEntities);

}
