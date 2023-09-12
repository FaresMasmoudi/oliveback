package com.crns.huileolive.dto;

import com.crns.huileolive.entities.TypeHuile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LothuileDto {
    private long id;
    private double quantiteObtenue;
    private double tauxAcide;
    private TypeHuile typeHuile;
    private int nbciternes;
    private String nomProducteur;
    private MoulinageDto moulinage;
}
