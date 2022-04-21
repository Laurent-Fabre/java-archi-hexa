package com.archi.hexa.database.repositories;

import com.archi.hexa.database.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
