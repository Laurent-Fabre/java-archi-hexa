package com.archi.hexa.service.out;

import com.archi.hexa.model.Garage;

import java.util.List;

/**
 * Interface call by the provider Out (Controller, ...)
 */
public interface IGarageServiceOut {

    List<Garage> getAllGarages();

    Garage createGarage(Garage garage);

    Garage updateGarage(Long garageId, Garage garage);

    Garage getGarageById(Long garageId);

    void deleteGarage(Long garageId);
}
