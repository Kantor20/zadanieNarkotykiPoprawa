package pl.kurs.java.exceptions;

public class TheKidIsAlreadyDeadException extends RuntimeException {
    public TheKidIsAlreadyDeadException() {
    }

    public TheKidIsAlreadyDeadException(String message) {
        super(message);
    }
}