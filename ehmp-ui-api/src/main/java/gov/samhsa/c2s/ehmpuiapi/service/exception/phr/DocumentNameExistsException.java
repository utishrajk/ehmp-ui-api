package gov.samhsa.c2s.ehmpuiapi.service.exception.phr;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class DocumentNameExistsException extends RuntimeException {
    public DocumentNameExistsException() {}

    public DocumentNameExistsException(String message) {
        super(message);
    }
}
