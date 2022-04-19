package com.archi.hexa.database;

import com.archi.hexa.database.repositories.GarageRepository;
import com.archi.hexa.model.Garage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.archi.hexa.service.in.IGarageServiceIn;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DataBaseGarageProvider implements IGarageServiceIn {
    private final GarageRepository garageRepository;


    @Override
    public List<Garage> getAllGarage() {
        return null;
    }

    @Override
    public Garage createGarage(Garage garage) {
        return null;
    }

    @Override
    public Garage updateGarage(Long garageId, Garage garage) {
        return null;
    }

    @Override
    public Optional<Garage> findGarageById(Long garageId) {
        return Optional.empty();
    }
}
