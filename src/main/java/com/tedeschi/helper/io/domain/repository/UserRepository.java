package com.tedeschi.helper.io.domain.repository;

import com.tedeschi.helper.io.domain.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    public Optional<UserEntity> findByEmail(String email);
}
