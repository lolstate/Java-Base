package com.lolstate.auth.dto.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LoginQuery {
    private String username;
    private String password;
}
