package org.airtribe.LearnerManagementSystem.exception;

public class LearnerNotFoundException extends Exception {

    public LearnerNotFoundException(String message) {
        super(message);
    }

    public LearnerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
