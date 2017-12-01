package gov.samhsa.c2s.ehmpuiapi.infrastructure.dto;

import lombok.Data;


@Data
public class UserProfileSelfServiceEditDto {
    private UmsAddressDto homeAddress;

    private String homeEmail;

    private String homePhone;

    private String lastUpdatedBy;
}
