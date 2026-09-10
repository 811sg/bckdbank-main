package com.danidevbank.demo.service.impl;

import com.danidevbank.demo.dto.request.LoginRequest;
import com.danidevbank.demo.dto.request.RegisterRequest;
import com.danidevbank.demo.dto.response.AuthResponse;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
    
}
