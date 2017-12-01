package gov.samhsa.c2s.ehmpuiapi.service.exception.phr;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class DocumentSaveException extends RuntimeException {
    public DocumentSaveException() {}

    public DocumentSaveException(String message) {
        super(message);
    }
}
