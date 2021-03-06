package gov.samhsa.c2s.ehmpuiapi.service.mapping.customconverter;

import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.UmsAddressDto;
import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.UmsUserDto;
import gov.samhsa.c2s.ehmpuiapi.service.mapping.Use;
import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;

@Component
public class UmsAddressesToWorkAddressConverter extends AbstractConverter<UmsUserDto, UmsAddressDto> {
    @Override
    protected UmsAddressDto convert(UmsUserDto source) {
        return source.getAddresses().stream()
                .filter(umsAddressDto -> umsAddressDto.getUse().equalsIgnoreCase(Use.WORK.toString()))
                .findFirst()
                .orElse(null);
    }
}
