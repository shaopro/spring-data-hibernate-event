package io.github.teastman.hibernate.exception;

/**
 * Exception for when a method has in incorrect number of parameters defined.
 *
 * @author Tyler Eastman
 */
public class InvalidParameterCountException extends Exception {

    public InvalidParameterCountException() {
    }

    public InvalidParameterCountException(String message) {
        super(message);
    }
}
