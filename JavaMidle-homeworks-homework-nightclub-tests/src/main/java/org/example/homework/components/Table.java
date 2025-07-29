package org.example.homework.components;

import lombok.Builder;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;
import org.example.homework.enums.LightingColor;
import org.example.homework.enums.Models;

import java.util.Set;

@Value
@Builder(toBuilder = true)
@Setter
public class Table {
    Models model;
    Countertop countertop;
    ElectricMotor electricMotor;
    Underframe underframe;
    @NonFinal
    Set<LightingColor> lightingColors;
}