package com.archi.hexa.database;

import com.archi.hexa.database.mapper.GarageEntityMapper;
import com.archi.hexa.database.repositories.GarageRepository;
import com.archi.hexa.model.Garage;
import com.archi.hexa.service.out.IGarageServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DataBaseGarageProvider implements IGarageServiceOut {
    private final GarageRepository garageRepository;
    private final GarageEntityMapper garageMapper;

    @Override
    public List<Garage> getAllGarage() {
        return this.garageMapper.lstGarageEntitiesToLstGarages(this.garageRepository.findAll());
    }

    @Override
    public Garage createGarage(Garage garage) {
        return this.garageMapper.garageEntityToGarage(this.garageRepository.save(this.garageMapper.garageToGarageEntity(garage)));
    }

    @Override
    public Garage updateGarage(Garage garage) {
        return null;
    }

    @Override
    public Optional<Garage> findGarageById(Long garageId) {
        return this.garageRepository.findById(garageId)
                .map(this.garageMapper::garageEntityToGarage);
    }

    @Override
    public void deleteGarage(Long garageId) {
        this.garageRepository.deleteById(garageId);
    }
}
