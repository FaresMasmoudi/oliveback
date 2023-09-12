package com.crns.huileolive.dto;

import com.crns.huileolive.entities.TypeRecipient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RecipientDto {
    private long id;
    private String emplacement;
    private String codeQr;
    private TypeRecipient typeRecipient;
    private CiterneDto citerne;
}
