package com.epam.esm.authentication;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResultDto {
    private String token;
    private long tokenValidity;
}
