package com.epam.handling.composite;

import com.epam.handling.exception.UnsupportedElementException;

import java.util.List;

public class Leaf implements Component {

    private String value;

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Leaf() {}

    public Leaf(String value) {
        this.value = value;
    }

    public void add(Component component) {
        throw new UnsupportedElementException("Operation is not supported for this element"); }

    public Object getChild(int i) {
        throw new UnsupportedElementException("Operation is not supported for this element");
    }

    @Override
    public List<Component> getComponents() {
        throw new UnsupportedElementException("Operation is not supported for this element");
    }

    public void remove(Component component) {
        throw new UnsupportedElementException("Operation is not supported for this element");}

    @Override
    public String toString() {
        return "Leaf{" +
                "value='" + value + '\'' +
                '}';
    }
}
