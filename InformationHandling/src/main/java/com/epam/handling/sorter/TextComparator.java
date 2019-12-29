package com.epam.handling.sorter;

import com.epam.handling.composite.Component;

import java.util.Comparator;

public class TextComparator implements Comparator<Component> {
    @Override
    public int compare(Component o1, Component o2) {
        return o1.getValue().length() - o2.getValue().length();
    }
}
