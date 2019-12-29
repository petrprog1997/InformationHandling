package com.epam.handling.exception;

public class UnsupportedElementException extends RuntimeException {
    public UnsupportedElementException() {
    }

    public UnsupportedElementException(String message) {
        super(message);
    }

    public UnsupportedElementException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedElementException(Throwable cause) {
        super(cause);
    }
}
