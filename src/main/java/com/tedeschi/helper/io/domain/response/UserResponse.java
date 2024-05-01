package com.tedeschi.helper.io.domain.response;

import java.time.LocalDateTime;

public record UserResponse(String firstName, String lastName, LocalDateTime joined) {
}