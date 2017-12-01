package gov.samhsa.c2s.ehmpuiapi.service.mapping.customconverter;

import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.TelecomDto;
import gov.samhsa.c2s.ehmpuiapi.service.dto.UserDto;
import gov.samhsa.c2s.ehmpuiapi.service.mapping.Use;
import gov.samhsa.c2s.ehmpuiapi.service.mapping.System;
import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmailPhoneToTelecomsConverter extends AbstractConverter<UserDto, List<TelecomDto>> {
    //Todo: Will support multiple Telecoms
    @Override
    protected List<TelecomDto> convert(UserDto source) {
        List<TelecomDto> TelecomDtos = new ArrayList<>();
        if (source.getHomeEmail() != null) {
            TelecomDtos.add(TelecomDto.builder()
                    .system(System.EMAIL.toString())
                    .value(source.getHomeEmail())
                    .use(Use.HOME.toString())
                    .build());
        }
        if (source.getHomePhone() != null) {
            TelecomDtos.add(TelecomDto.builder()
                    .system(System.PHONE.toString())
                    .value(source.getHomePhone())
                    .use(Use.HOME.toString())
                    .build());
        }

        return TelecomDtos;
    }
}
