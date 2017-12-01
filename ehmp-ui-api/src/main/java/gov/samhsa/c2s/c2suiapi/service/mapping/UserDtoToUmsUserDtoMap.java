package gov.samhsa.c2s.c2suiapi.service.mapping;

import gov.samhsa.c2s.c2suiapi.infrastructure.dto.UmsUserDto;
import gov.samhsa.c2s.c2suiapi.service.dto.UserDto;
import gov.samhsa.c2s.c2suiapi.service.mapping.customconverter.EmailPhoneToTelecomsConverter;
import gov.samhsa.c2s.c2suiapi.service.mapping.customconverter.HomeWorkAddressToAddressesConverter;
import gov.samhsa.c2s.c2suiapi.service.mapping.customconverter.PatientRoleToMultiRoleCodesConverter;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDtoToUmsUserDtoMap extends PropertyMap<UserDto, UmsUserDto> {

    private EmailPhoneToTelecomsConverter emailPhoneToTelecomsConverter;

    private HomeWorkAddressToAddressesConverter homeWorkAddressToAddressesConverter;

    private PatientRoleToMultiRoleCodesConverter patientRoleToMultiRoleCodesConverter;

    @Autowired
    public UserDtoToUmsUserDtoMap(EmailPhoneToTelecomsConverter emailPhoneToTelecomsConverter, HomeWorkAddressToAddressesConverter homeWorkAddressToAddressesConverter, PatientRoleToMultiRoleCodesConverter patientRoleToMultiRoleCodesConverter) {
        this.emailPhoneToTelecomsConverter = emailPhoneToTelecomsConverter;
        this.homeWorkAddressToAddressesConverter = homeWorkAddressToAddressesConverter;
        this.patientRoleToMultiRoleCodesConverter = patientRoleToMultiRoleCodesConverter;
    }

    @Override
    protected void configure() {
        using(emailPhoneToTelecomsConverter).map(source).setTelecoms(null);
        using(homeWorkAddressToAddressesConverter).map(source).setAddresses(null);
        using(patientRoleToMultiRoleCodesConverter).map(source).setRoles(null);
    }
}
