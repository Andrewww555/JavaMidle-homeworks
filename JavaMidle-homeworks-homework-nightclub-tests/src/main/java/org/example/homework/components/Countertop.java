package org.example.homework.components;

import lombok.Builder;
import lombok.Value;
import org.example.homework.enums.Color;
import org.example.homework.enums.Material;

@Value
@Builder
public class Countertop {
    Material material;
    Color color;
    int width;  // ширина
    int depth;  // глубина
}
