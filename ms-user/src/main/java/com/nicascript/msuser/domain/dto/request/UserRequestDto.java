package com.nicascript.msuser.domain.dto.request;

import lombok.Data;

@Data
public class UserRequestDto {

    private String username;
    private String email;
    private String firstName;
    private String lastName;
}
