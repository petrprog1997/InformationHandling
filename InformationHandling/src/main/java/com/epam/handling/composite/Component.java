package com.epam.handling.composite;

import com.epam.handling.exception.UnsupportedElementException;

import java.util.List;

public interface Component {

    void add(Component component);

    Object getChild(int i);

    List<Component> getComponents();

    String getValue();

    void remove(Component component);
}