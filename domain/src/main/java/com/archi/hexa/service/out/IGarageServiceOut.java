package com.archi.hexa.service.out;

import com.archi.hexa.model.Garage;

import java.util.List;
import java.util.Optional;

/**
 * Interface call by the provider In (Database, ...)
 */
public interface IGarageServiceOut {

    List<Garage> getAllGarage();

    Garage createGarage(Garage garage);

    Garage updateGarage(Garage garage);

    Optional<Garage> findGarageById(Long garageId);

    void deleteGarage(Long garageId);
}
