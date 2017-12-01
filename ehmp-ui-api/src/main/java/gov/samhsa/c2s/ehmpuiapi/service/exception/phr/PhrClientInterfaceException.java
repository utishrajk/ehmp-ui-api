package gov.samhsa.c2s.ehmpuiapi.service.exception.phr;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class PhrClientInterfaceException extends RuntimeException{
    public PhrClientInterfaceException() {
    }

    public PhrClientInterfaceException(String message) {
        super(message);
    }
}
