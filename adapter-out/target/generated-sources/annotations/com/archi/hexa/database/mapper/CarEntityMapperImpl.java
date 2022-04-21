package com.archi.hexa.database.mapper;

import com.archi.hexa.database.entities.CarEntity;
import com.archi.hexa.database.entities.CarEntity.CarEntityBuilder;
import com.archi.hexa.model.Car;
import com.archi.hexa.model.Car.CarBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CarEntityMapperImpl implements CarEntityMapper {

    @Override
    public Car carEntityToCar(CarEntity carEntity) {
        if ( carEntity == null ) {
            return null;
        }

        CarBuilder car = Car.builder();

        if ( carEntity.getId() != null ) {
            car.id( carEntity.getId().longValue() );
        }
        car.registration( carEntity.getRegistration() );

        return car.build();
    }

    @Override
    public CarEntity carToCarEntity(Car car) {
        if ( car == null ) {
            return null;
        }

        CarEntityBuilder carEntity = CarEntity.builder();

        if ( car.getId() != null ) {
            carEntity.id( car.getId().intValue() );
        }
        carEntity.registration( car.getRegistration() );

        return carEntity.build();
    }

    @Override
    public List<Car> lstCarEntitiesToLstCars(List<CarEntity> lstCarEntities) {
        if ( lstCarEntities == null ) {
            return null;
        }

        List<Car> list = new ArrayList<Car>( lstCarEntities.size() );
        for ( CarEntity carEntity : lstCarEntities ) {
            list.add( carEntityToCar( carEntity ) );
        }

        return list;
    }
}
