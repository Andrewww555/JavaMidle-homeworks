package org.example.homework;

public class Person {
    private final String name;
    private final String dressCode;
    private boolean hasDebt;

    public Person(String name, String dressCode, boolean hasDebt) {
        this.name = name;
        this.dressCode = dressCode;
        this.hasDebt = hasDebt;
    }

    public String getName() {
        return name;
    }

    public String getDressCode() {
        return dressCode;
    }

    public boolean hasDebt() {
        return hasDebt;
    }

    public void setHasDebt(boolean hasDebt) {
        this.hasDebt = hasDebt;
    }
}