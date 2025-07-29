package org.example.homework.components;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ElectricMotor {
    int powerWatt;
    boolean isSilent;
}
