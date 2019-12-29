package com.epam.handling.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private String value;

    public Composite() {}

    public Composite(String value) {
        this.value = value;
    }

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public Object getChild(int i) {
        return components.get(i);
    }

    public List<Component> getComponents() {
        return components;
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Composite composite = (Composite) o;

        return value != null ? value.equals(composite.value) : composite.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Composite{" +
                "value='" + value + '\'' +
                '}';
    }
}
