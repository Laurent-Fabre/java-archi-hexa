package com.archi.hexa.controllers;

import com.archi.hexa.dto.GarageDTO;
import com.archi.hexa.mapper.GarageDTOMapper;
import lombok.RequiredArgsConstructor;
import com.archi.hexa.model.Garage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.archi.hexa.service.out.IGarageServiceOut;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/garages")
public class GarageController {
    private final IGarageServiceOut garageService;
    private final GarageDTOMapper garageMapper;

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public List<GarageDTO> getAllGarages() {
        return this.garageMapper.lstGaragesToLstGaragesDTO(this.garageService.getAllGarages());
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public GarageDTO getGarageById(@PathVariable Long id) {
        final Garage garage = this.garageService.getGarageById(id);
        return this.garageMapper.garageToGarageDTO(garage);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    @ResponseBody
    public GarageDTO createGarage(GarageDTO pGarageDTO) {
        final Garage garage = this.garageService.createGarage(this.garageMapper.garageDTOToGarage(pGarageDTO));
        return this.garageMapper.garageToGarageDTO(garage);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public GarageDTO updateGarage(@PathVariable Long id, @RequestBody GarageDTO garageDTO) {
        final Garage garage = this.garageService.updateGarage(id, this.garageMapper.garageDTOToGarage(garageDTO));
        return this.garageMapper.garageToGarageDTO(garage);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public String deleteGarage(@PathVariable Long id) {
        this.garageService.deleteGarage(id);
        return "Garage removed";
    }

}
