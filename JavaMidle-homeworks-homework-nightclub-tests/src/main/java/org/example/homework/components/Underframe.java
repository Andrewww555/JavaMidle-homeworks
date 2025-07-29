package org.example.homework.components;

import lombok.Builder;
import lombok.Value;
import org.example.homework.enums.Color;
import org.example.homework.enums.Material;

@Value
@Builder
public class Underframe {
    Material material;
    Color color;
    boolean adjustableHeight;
}
