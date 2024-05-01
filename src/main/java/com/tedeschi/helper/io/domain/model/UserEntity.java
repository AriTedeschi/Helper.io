package com.tedeschi.helper.io.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Entity
public class UserEntity implements Serializable {
    private @Id @GeneratedValue Long id;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime joined;
}
