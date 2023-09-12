package com.crns.huileolive.dto;

import com.crns.huileolive.entities.TypeSolvant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SolvantDto {

    private long id;
    private TypeSolvant typeSolvant;
    private Double mesure;
}
