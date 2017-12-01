package gov.samhsa.c2s.ehmpuiapi.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidConsentSignDateException extends RuntimeException{
    public InvalidConsentSignDateException(){}

    public InvalidConsentSignDateException(String message){
       super(message);
    }
}
