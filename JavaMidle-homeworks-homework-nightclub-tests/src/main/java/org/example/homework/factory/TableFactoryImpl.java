package org.example.homework.factory;

import org.example.homework.components.Table;
import org.example.homework.enums.Models;

public class TableFactoryImpl implements TableFactory {
    @Override
    public Table createStartTable() {
        TableConfig config = TableConfigFactory.getTableConfig(Models.START);
        return Table.builder()
                .model(config.getModel())
                .countertop(config.getCountertop())
                .electricMotor(config.getElectricMotor())
                .underframe(config.getUnderframe())
                .lightingColors(config.getLightingColors())
                .build();
    }

    @Override
    public Table createMediumTable() {
        TableConfig config = TableConfigFactory.getTableConfig(Models.MEDIUM);
        return Table.builder()
                .model(config.getModel())
                .countertop(config.getCountertop())
                .electricMotor(config.getElectricMotor())
                .underframe(config.getUnderframe())
                .lightingColors(config.getLightingColors())
                .build();
    }

    @Override
    public Table createFullTable() {
        TableConfig config = TableConfigFactory.getTableConfig(Models.FULL);
        return Table.builder()
                .model(config.getModel())
                .countertop(config.getCountertop())
                .electricMotor(config.getElectricMotor())
                .underframe(config.getUnderframe())
                .lightingColors(config.getLightingColors())
                .build();
    }
}