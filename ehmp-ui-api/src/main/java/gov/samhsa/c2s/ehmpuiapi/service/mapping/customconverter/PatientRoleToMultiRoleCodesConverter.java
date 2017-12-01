package gov.samhsa.c2s.ehmpuiapi.service.mapping.customconverter;

import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.RoleDto;
import gov.samhsa.c2s.ehmpuiapi.service.dto.UserDto;
import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PatientRoleToMultiRoleCodesConverter extends AbstractConverter<UserDto, List<RoleDto>> {
    @Override
    protected List<RoleDto> convert(UserDto source) {
        return source.getRoles().stream()
                .map(roleCode -> RoleDto.builder().code(roleCode).build())
                .collect(Collectors.toList());
    }
}
