package com.archi.hexa.service.in;

import com.archi.hexa.model.Garage;

import java.util.List;
import java.util.Optional;

/**
 * Interface call by the provider In (Database, ...)
 */
public interface IGarageServiceIn {

    List<Garage> getAllGarage();

    Garage createGarage(Garage garage);

    Garage updateGarage(Long garageId, Garage garage);

    Optional<Garage> findGarageById(Long garageId);
}
