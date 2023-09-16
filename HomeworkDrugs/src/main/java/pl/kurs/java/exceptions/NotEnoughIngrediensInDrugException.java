package pl.kurs.java.exceptions;

public class NotEnoughIngrediensInDrugException extends RuntimeException {
    public NotEnoughIngrediensInDrugException() {
    }

    public NotEnoughIngrediensInDrugException(String message) {
        super(message);
    }
}