package com.crns.huileolive.dto;

import com.crns.huileolive.entities.TypeCiterne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CiterneDto {
    private long id;
    private String emplacement;
    private double capaciteReelle;
    private TypeCiterne typeCiterne;
    private String codeQr;
    private LothuileDto lothuile;
}
