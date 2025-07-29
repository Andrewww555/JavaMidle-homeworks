package org.example.homework.factory;

import org.example.homework.components.Table;

public interface TableFactory {
    Table createStartTable();
    Table createMediumTable();
    Table createFullTable();
}
