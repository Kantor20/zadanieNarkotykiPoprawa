package pl.kurs.java.exceptions;

public class DrugIsNullException extends RuntimeException {
    public DrugIsNullException() {
    }

    public DrugIsNullException(String message) {
        super(message);
    }
}