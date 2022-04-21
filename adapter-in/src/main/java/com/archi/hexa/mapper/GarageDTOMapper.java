package com.archi.hexa.mapper;

import com.archi.hexa.dto.GarageDTO;
import com.archi.hexa.model.Garage;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Interface that represents the {@link GarageDTO} mapper.
 */
@Mapper(componentModel = "spring")
public interface GarageDTOMapper {

    Garage garageDTOToGarage(GarageDTO garageDTO);

    GarageDTO garageToGarageDTO(Garage garage);

    List<GarageDTO> lstGaragesToLstGaragesDTO(List<Garage> lstGarages);
}
