package com.danidevbank.demo.service.impl;

import java.util.List;

import com.danidevbank.demo.dto.AccountResponse;

public interface AccountService {
    List<AccountResponse> getUserAccounts(String email);
    AccountResponse getAccountByNumber(String accountNumber, String email);
}
