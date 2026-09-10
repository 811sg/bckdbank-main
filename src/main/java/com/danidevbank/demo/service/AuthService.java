package com.danidevbank.demo.service;

import org.apache.coyote.BadRequestException;

import com.danidevbank.demo.dto.request.LoginRequest;
import com.danidevbank.demo.dto.request.RegisterRequest;
import com.danidevbank.demo.dto.response.AuthResponse;

public interface AuthService {
    AuthResponse register(RegisterRequest request) throws BadRequestException;
    AuthResponse login(LoginRequest request);
}
