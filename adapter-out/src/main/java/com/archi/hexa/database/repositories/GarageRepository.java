package com.archi.hexa.database.repositories;

import com.archi.hexa.database.entities.GarageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GarageRepository extends JpaRepository<GarageEntity, Long> {
}
