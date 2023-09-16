package pl.kurs.java.model;


import pl.kurs.java.exceptions.TheKidIsAlreadyDeadException;

import java.util.List;

public class Check {
    public static void dead(List<DrugDealer> drugs) {
        if (drugs.size() >= 5) {
            throw new TheKidIsAlreadyDeadException("Kid is die.");
        }
    }
}