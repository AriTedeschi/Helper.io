package com.tedeschi.helper.io.domain.adapter;

import com.tedeschi.helper.io.domain.model.UserEntity;
import com.tedeschi.helper.io.domain.response.UserResponse;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserResponseAdapter {
    private UserResponse userResponse;

    public UserResponseAdapter(UserEntity entity){
        this.userResponse = new UserResponse(entity.getFirstName(), entity.getLastName(), entity.getJoined());
    }

    public UserResponse getInstance(){
        return userResponse;
    }
}
