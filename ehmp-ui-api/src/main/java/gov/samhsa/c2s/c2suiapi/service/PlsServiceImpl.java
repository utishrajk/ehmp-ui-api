package gov.samhsa.c2s.c2suiapi.service;

import gov.samhsa.c2s.c2suiapi.infrastructure.PlsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlsServiceImpl implements PlsService {

    @Autowired
    PlsClient plsClient;

    @Override
    public Object searchProviders(String state, String city, String zipCode,
                                  String firstName, String lastName, String genderCode,
                                  String orgName, String phone, String page,
                                  String size, String sort, String projection,
                                  String xForwardedProto, String xForwardedHost,
                                  String xForwardedPrefix, String xForwardedPort) {
        return plsClient.searchProviders(state, city, zipCode,
                firstName, lastName, genderCode,
                orgName, phone, page,
                size, sort, PlsClient.Projection.FLATTEN_SMALL_PROVIDER,
                xForwardedProto, xForwardedHost, xForwardedPrefix.concat("/pls"),
                xForwardedPort);
    }
}
