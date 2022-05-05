package com.archi.hexa.database.mapper;

import com.archi.hexa.database.entities.GarageEntity;
import com.archi.hexa.model.Garage;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Interface that represents the @{@link GarageEntity} mapper.
 */
@Mapper(componentModel = "spring")
public interface GarageEntityMapper {

    Garage garageEntityToGarage(GarageEntity garageEntity);

    GarageEntity garageToGarageEntity(Garage garage);

    List<Garage> lstGarageEntitiesToLstGarages(List<GarageEntity> lstGarageEntities);

}
