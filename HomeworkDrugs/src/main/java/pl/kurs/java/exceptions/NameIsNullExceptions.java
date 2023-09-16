package pl.kurs.java.exceptions;

public class NameIsNullExceptions extends RuntimeException {
    public NameIsNullExceptions() {
    }

    public NameIsNullExceptions(String message) {
        super(message);
    }
}