package com.archi.hexa.service.in.impl;

import com.archi.hexa.model.Garage;
import com.archi.hexa.service.in.IGarageServiceIn;
import com.archi.hexa.service.out.IGarageServiceOut;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GarageServiceIn implements IGarageServiceIn {

    private final IGarageServiceOut garageServiceOut;

    @Override
    public List<Garage> getAllGarages() {
        return this.garageServiceOut.getAllGarage();
    }

    @Override
    public Garage createGarage(Garage garage) {
        return this.garageServiceOut.createGarage(garage);
    }

    @Override
    public Garage updateGarage(Long garageId, Garage garage) {
        return this.garageServiceOut.updateGarage(garage);
    }

    @Override
    public Garage getGarageById(Long garageId) {
        return this.garageServiceOut.findGarageById(garageId)
                .orElseThrow(() -> new RuntimeException(String.format("No garage has been found for id %d", garageId)));
    }

    @Override
    public void deleteGarage(Long garageId) {
        this.garageServiceOut.findGarageById(garageId)
                .ifPresentOrElse(
                        (garage) -> this.garageServiceOut.deleteGarage(garage.getId()),
                        () -> {
                            throw new RuntimeException(String.format("No garage has been found for id %d", garageId));
                        }
                );
    }
}
