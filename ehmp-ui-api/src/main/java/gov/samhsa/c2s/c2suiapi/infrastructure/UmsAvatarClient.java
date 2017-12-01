package gov.samhsa.c2s.c2suiapi.infrastructure;

import gov.samhsa.c2s.c2suiapi.service.dto.AvatarBytesAndMetaDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ums")
@Service
public interface UmsAvatarClient {
    @RequestMapping(value = "/user-avatars/user/{userId}/avatar", method = RequestMethod.GET)
    Object getUserAvatar(@PathVariable("userId") Long userId);

    @RequestMapping(value = "/user-avatars/user/{userId}/avatar", method = RequestMethod.POST)
    Object saveNewUserAvatar(@PathVariable("userId") Long userId,
                             @RequestBody AvatarBytesAndMetaDto avatarFile);

    @RequestMapping(value = "/user-avatars/user/{userId}/avatar", method = RequestMethod.DELETE)
    void deleteUserAvatar(@PathVariable("userId") Long userId);
}
