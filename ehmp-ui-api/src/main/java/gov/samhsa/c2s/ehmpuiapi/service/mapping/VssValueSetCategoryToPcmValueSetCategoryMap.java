package gov.samhsa.c2s.ehmpuiapi.service.mapping;

import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;


@Component
public class VssValueSetCategoryToPcmValueSetCategoryMap extends PropertyMap<gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.ValueSetCategoryDto, gov.samhsa.c2s.ehmpuiapi.service.dto.ValueSetCategoryDto> {

    @Override
    protected void configure() {
        map().setDisplayName(source.getName());
    }
}