package gov.samhsa.c2s.ehmpuiapi.service;

import gov.samhsa.c2s.ehmpuiapi.infrastructure.PcmClient;
import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.ConsentProviderDto;
import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.DetailedConsentDto;
import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.PageableDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PcmServiceImpl implements PcmService {
    private static final boolean CREATED_BY_PATIENT = true;
    private static final boolean UPDATED_BY_PATIENT = true;
    private static final boolean ATTESTED_BY_PATIENT = true;
    private static final boolean REVOKED_BY_PATIENT = true;
    private static final String DATA_SOURCE_DATE_TIME_FORMATTER = "yyyy-MM-dd HH:mm:ss.S";
    private static final String OUTPUT_DATE_TIME_FORMATTER = "MM/dd/yyyy HH:mm:ss";
    private final PcmClient pcmClient;

    @Autowired
    public PcmServiceImpl(PcmClient pcmClient) {
        this.pcmClient = pcmClient;
    }

    @Override
    public List<ConsentProviderDto> getProviders(String mrn) {
        return pcmClient.getProviders(mrn);
    }

    @Override
    public PageableDto<DetailedConsentDto> getConsents(String mrn, Integer page, Integer size) {
        return pcmClient.getConsents(mrn, page, size, LocaleContextHolder.getLocale());
    }


}