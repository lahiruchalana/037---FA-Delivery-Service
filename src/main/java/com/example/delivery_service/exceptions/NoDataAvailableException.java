package com.example.delivery_service.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NoDataAvailableException extends RuntimeException {

    private String message;

    public NoDataAvailableException(String message) {
        super(message);
        this.message = message;
    }
}
