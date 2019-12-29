package com.epam.handling.sorter;

import com.epam.handling.composite.Component;

import java.util.List;
import java.util.Set;

public interface Sorter {

    List<Component> componentSort(List<Component> unsortedComponentList);
}
