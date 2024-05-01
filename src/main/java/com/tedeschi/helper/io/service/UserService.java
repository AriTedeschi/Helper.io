package com.tedeschi.helper.io.service;

import com.tedeschi.helper.io.domain.request.UserRequest;
import com.tedeschi.helper.io.domain.response.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponse register(UserRequest request);
    UserResponse getByEmail(UserRequest request);
}
