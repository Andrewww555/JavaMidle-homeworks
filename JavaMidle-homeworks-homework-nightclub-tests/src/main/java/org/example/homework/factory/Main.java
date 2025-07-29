package org.example.homework.factory;

import org.example.homework.components.Table;

public class Main {
    public static void main(String[] args) {
        TableFactory tableFactory = new TableFactoryImpl();

        Table startTable = tableFactory.createStartTable();
        Table mediumTable = tableFactory.createMediumTable();
        Table fullTable = tableFactory.createFullTable();

        System.out.println("START стол:");
        printTableInfo(startTable);

        System.out.println("\nMEDIUM стол:");
        printTableInfo(mediumTable);

        System.out.println("\nFULL стол:");
        printTableInfo(fullTable);
    }

    private static void printTableInfo(Table table) {
        System.out.println("Модель: " + table.getModel());
        System.out.println("Столешница: " + table.getCountertop());
        System.out.println("Мотор: " + table.getElectricMotor());
        System.out.println("Подстолье: " + table.getUnderframe());
        System.out.println("Подсветка: " + table.getLightingColors());
    }
}