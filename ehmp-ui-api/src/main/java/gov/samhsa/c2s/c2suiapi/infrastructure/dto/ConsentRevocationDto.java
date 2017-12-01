package gov.samhsa.c2s.c2suiapi.infrastructure.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class ConsentRevocationDto {
    @Valid
    @NotNull
    private boolean acceptTerms;
}