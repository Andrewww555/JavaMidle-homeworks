package org.example.homework.factory;

import lombok.Builder;
import lombok.Value;
import org.example.homework.components.Countertop;
import org.example.homework.components.ElectricMotor;
import org.example.homework.components.Underframe;
import org.example.homework.enums.LightingColor;
import org.example.homework.enums.Models;

import java.util.Set;

@Value
@Builder
public class TableConfig {
    Models model;
    Countertop countertop;
    ElectricMotor electricMotor;
    Underframe underframe;
    Set<LightingColor> lightingColors;
}