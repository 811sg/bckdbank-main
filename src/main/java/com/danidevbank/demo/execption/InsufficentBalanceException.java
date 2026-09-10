package com.danidevbank.demo.execption;

public class InsufficentBalanceException extends RuntimeException {
    public InsufficentBalanceException(String message) {
        super(message);
    }


}
