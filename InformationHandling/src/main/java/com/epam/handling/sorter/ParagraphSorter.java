package com.epam.handling.sorter;

import com.epam.handling.composite.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ParagraphSorter implements Sorter {

    @Override
    public List<Component> componentSort(List<Component> unsortedComponentList) {
        TextComparator comparator = new TextComparator();
        Set<Component> sortedSet = new TreeSet<>(comparator);
        sortedSet.addAll(unsortedComponentList);
        List<Component> sortedList = new ArrayList<>(sortedSet);
        return sortedList;
    }
}
