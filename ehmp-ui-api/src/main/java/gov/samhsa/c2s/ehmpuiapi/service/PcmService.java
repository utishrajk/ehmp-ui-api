package gov.samhsa.c2s.ehmpuiapi.service;

import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.ConsentProviderDto;
import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.DetailedConsentDto;
import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.PageableDto;

import java.util.List;

public interface PcmService {

    List<ConsentProviderDto> getProviders(String mrn);

    PageableDto<DetailedConsentDto> getConsents(String mrn, Integer page, Integer size);

}