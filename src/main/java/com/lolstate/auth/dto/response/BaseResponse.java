package com.lolstate.auth.dto.response;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaseResponse {
    private UUID id;
    private Long createdDate;
    private Long updatedDate;
    private Long deletedDate;
}
