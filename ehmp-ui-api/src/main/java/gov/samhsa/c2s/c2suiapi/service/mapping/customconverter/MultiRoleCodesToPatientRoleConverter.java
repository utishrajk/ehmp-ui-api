package gov.samhsa.c2s.c2suiapi.service.mapping.customconverter;

import gov.samhsa.c2s.c2suiapi.infrastructure.dto.RoleDto;
import gov.samhsa.c2s.c2suiapi.infrastructure.dto.UmsUserDto;
import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MultiRoleCodesToPatientRoleConverter extends AbstractConverter<UmsUserDto, List<String>> {
    @Override
    protected List<String> convert(UmsUserDto source) {
        return source.getRoles().stream()
                .map(RoleDto::getCode)
                .collect(Collectors.toList());
    }
}
