package com.tedeschi.helper.io.domain.adapter;

import com.tedeschi.helper.io.domain.model.UserEntity;
import com.tedeschi.helper.io.domain.request.UserRequest;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class UserEntityAdapter {
    private UserEntity userEntity;

    public UserEntityAdapter(UserRequest request){
        this.userEntity = UserEntity.builder()
                .email(request.email())
                .firstName(request.firstName())
                .lastName(request.lastName())
                .joined(LocalDateTime.now()).build();
    }

    public UserEntity getInstance(){
        return userEntity;
    }
}
