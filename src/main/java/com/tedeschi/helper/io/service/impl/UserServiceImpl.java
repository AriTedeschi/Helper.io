package com.tedeschi.helper.io.service.impl;

import com.tedeschi.helper.io.domain.adapter.UserEntityAdapter;
import com.tedeschi.helper.io.domain.adapter.UserResponseAdapter;
import com.tedeschi.helper.io.domain.model.UserEntity;
import com.tedeschi.helper.io.domain.repository.UserRepository;
import com.tedeschi.helper.io.domain.request.UserRequest;
import com.tedeschi.helper.io.domain.response.UserResponse;
import com.tedeschi.helper.io.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public UserResponse register(UserRequest request) {
        return new UserResponseAdapter(repository.save(new UserEntityAdapter(request).getUserEntity())).getInstance();
    }

    @Override
    public UserResponse getByEmail(UserRequest request) {
        UserEntity userEntity = repository.findByEmail(request.email()).orElse(null);
        return new UserResponseAdapter(userEntity).getInstance();
    }
}
