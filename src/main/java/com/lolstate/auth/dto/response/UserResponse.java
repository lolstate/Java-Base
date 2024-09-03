package com.lolstate.auth.dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserResponse {
    private String username;
    private String email;
    private String phone;
    private String role;
    private String status;
}
