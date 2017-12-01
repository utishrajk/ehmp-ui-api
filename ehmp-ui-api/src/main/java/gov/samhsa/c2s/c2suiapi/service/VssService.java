package gov.samhsa.c2s.c2suiapi.service;


import gov.samhsa.c2s.c2suiapi.service.dto.ValueSetCategoryDto;

import java.util.List;
import java.util.Locale;

public interface VssService {
    List<ValueSetCategoryDto> getValueSetCategories(Locale locale);
}
