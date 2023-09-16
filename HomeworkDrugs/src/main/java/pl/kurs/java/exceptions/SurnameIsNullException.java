package pl.kurs.java.exceptions;

public class SurnameIsNullException extends RuntimeException{
    public SurnameIsNullException() {
    }

    public SurnameIsNullException(String message) {
        super(message);
    }
}