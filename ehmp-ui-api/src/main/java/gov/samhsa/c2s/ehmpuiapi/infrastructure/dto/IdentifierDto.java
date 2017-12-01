package gov.samhsa.c2s.ehmpuiapi.infrastructure.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IdentifierDto {
    @NotBlank
    private String system;
    @NotBlank
    private String value;
}
