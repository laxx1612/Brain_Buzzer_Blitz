package com.mscomm.userservice.service;
import com.mscomm.userservice.entity.*;

import com.mscomm.userservice.dto.ResponseDto;
public interface UserService {
	User saveUser(User user);

    ResponseDto getUser(Long userId);
}
