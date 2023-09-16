package pl.kurs.java.exceptions;

public class KidISNullException extends RuntimeException{
    public KidISNullException() {
    }

    public KidISNullException(String message) {
        super(message);
    }
}