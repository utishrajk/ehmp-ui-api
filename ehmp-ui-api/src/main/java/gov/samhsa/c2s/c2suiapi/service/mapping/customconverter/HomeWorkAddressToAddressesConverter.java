package gov.samhsa.c2s.c2suiapi.service.mapping.customconverter;

import gov.samhsa.c2s.c2suiapi.infrastructure.dto.UmsAddressDto;
import gov.samhsa.c2s.c2suiapi.service.dto.UserDto;
import gov.samhsa.c2s.c2suiapi.service.mapping.Use;
import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//Todo: Will support multiple address
@Component
public class HomeWorkAddressToAddressesConverter extends AbstractConverter<UserDto, List<UmsAddressDto>> {
    @Override
    protected List<UmsAddressDto> convert(UserDto source) {
        UmsAddressDto homeAddressDto = source.getHomeAddress();
        homeAddressDto.setUse(Use.HOME.toString());
        return Arrays.asList(homeAddressDto);
    }
}
