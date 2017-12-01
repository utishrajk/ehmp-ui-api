package gov.samhsa.c2s.ehmpuiapi.infrastructure.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

@Data
public class ConsentTermDto {
    private Long id;

    @NotBlank
    @Size(max = 20000)
    private String text;
}
