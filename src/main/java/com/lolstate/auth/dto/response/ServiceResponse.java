package com.lolstate.auth.dto.response;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ServiceResponse {
    private boolean success;
    private Object data;
    private List<Error> errors = new ArrayList<>();

    @Data
    @AllArgsConstructor
    public static class Error {
        private String code;
        private String message;
    }

}
