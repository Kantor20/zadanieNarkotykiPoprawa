package pl.kurs.java.exceptions;

public class AgeMustBeMoreThanZeroException extends RuntimeException {
    public AgeMustBeMoreThanZeroException() {
    }

    public AgeMustBeMoreThanZeroException(String message) {
        super(message);
    }
}
