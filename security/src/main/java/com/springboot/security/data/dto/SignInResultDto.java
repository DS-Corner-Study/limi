package com.springboot.security.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SignInResultDto extends SignUpResultDto{

    private String token;

    @Builder
    public SignInResultDto(boolean sucess, int code, String msg, String token) {
        super(sucess, code, msg);
        this.token = token;
    }
}
