package pl.kurs.java.exceptions;

public class PriceIsLessThanZeroException extends RuntimeException {
    public PriceIsLessThanZeroException() {
    }

    public PriceIsLessThanZeroException(String message) {
        super(message);
    }
}