package gov.samhsa.c2s.ehmpuiapi.service.exception.ums;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class UserAvatarDeleteException extends RuntimeException {
    public UserAvatarDeleteException() {}

    public UserAvatarDeleteException(String message) {
        super(message);
    }
}
