package org.example.homework.factory;

import org.example.homework.components.Countertop;
import org.example.homework.components.ElectricMotor;
import org.example.homework.components.Underframe;
import org.example.homework.enums.Color;
import org.example.homework.enums.LightingColor;
import org.example.homework.enums.Material;
import org.example.homework.enums.Models;

import java.util.Set;

public class TableConfigFactory {
    public static TableConfig getTableConfig(Models model) {
        switch (model) {
            case MEDIUM:
                return TableConfig.builder()
                        .model(Models.MEDIUM)
                        .countertop(Countertop.builder()
                                .material(Material.CHIPBOARD)
                                .color(Color.WHITE)
                                .width(120)
                                .depth(60)
                                .build())
                        .electricMotor(ElectricMotor.builder()
                                .powerWatt(150)
                                .isSilent(true)
                                .build())
                        .underframe(Underframe.builder()
                                .material(Material.STEEL)
                                .color(Color.BLACK)
                                .adjustableHeight(true)
                                .build())
                        .lightingColors(Set.of(LightingColor.WHITE))
                        .build();
            case FULL:
                return TableConfig.builder()
                        .model(Models.FULL)
                        .countertop(Countertop.builder()
                                .material(Material.SOLID_WOOD)
                                .color(Color.OAK)
                                .width(140)
                                .depth(70)
                                .build())
                        .electricMotor(ElectricMotor.builder()
                                .powerWatt(200)
                                .isSilent(true)
                                .build())
                        .underframe(Underframe.builder()
                                .material(Material.ALUMINUM)
                                .color(Color.GRAY)
                                .adjustableHeight(true)
                                .build())
                        .lightingColors(Set.of(LightingColor.WHITE, LightingColor.BLUE, LightingColor.PINK))
                        .build();
            default:
                return TableConfig.builder()
                        .model(Models.START)
                        .countertop(Countertop.builder()
                                .material(Material.CHIPBOARD)
                                .color(Color.GRAY)
                                .width(100)
                                .depth(50)
                                .build())
                        .electricMotor(ElectricMotor.builder()
                                .powerWatt(100)
                                .isSilent(false)
                                .build())
                        .underframe(Underframe.builder()
                                .material(Material.STEEL)
                                .color(Color.BLACK)
                                .adjustableHeight(false)
                                .build())
                        .lightingColors(Set.of())
                        .build();
        }
    }
}