package com.validation.exception;

// Custom exception for department validation
public class InvalidDepartmentException extends Exception {

    public InvalidDepartmentException(String message) {
        super(message);
    }
}
