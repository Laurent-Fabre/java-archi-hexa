package com.archi.hexa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GarageDTO {
    private Integer id;
    private String address;
    private List<CarDTO> lstCars;
}
