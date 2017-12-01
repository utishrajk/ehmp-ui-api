package gov.samhsa.c2s.ehmpuiapi.web;

import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.ConsentProviderDto;
import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.DetailedConsentDto;
import gov.samhsa.c2s.ehmpuiapi.infrastructure.dto.PageableDto;
import gov.samhsa.c2s.ehmpuiapi.service.PcmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pcm")
public class PcmRestController {

    private final PcmService pcmService;

    @Autowired
    public PcmRestController(PcmService pcmService) {
        this.pcmService = pcmService;
    }

    @GetMapping("/patients/{mrn}/providers")
    public List<ConsentProviderDto> getProviders(@PathVariable String mrn) {
        return pcmService.getProviders(mrn);
    }


    @GetMapping("/patients/{mrn}/consents")
    public PageableDto<DetailedConsentDto> getConsents(@PathVariable String mrn,
                                                       @RequestParam(value = "page", required = false) Integer page,
                                                       @RequestParam(value = "size", required = false) Integer size) {
        return pcmService.getConsents(mrn, page, size);
    }

}