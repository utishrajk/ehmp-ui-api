package gov.samhsa.c2s.ehmpuiapi.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class IExhubXdsbClientException extends RuntimeException  {
    public IExhubXdsbClientException() {
    }

    public IExhubXdsbClientException(String message) {
        super(message);
    }
}
