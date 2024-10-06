package com.nicascript.msuser.domain.dto.response;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class UserResponseDto {
    private UUID id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
}
