package com.epam.handling.parser;

import com.epam.handling.composite.Component;
import com.epam.handling.composite.Leaf;

import java.util.ArrayList;
import java.util.List;

public class SentenceParser extends AbstractParser {

    public Component parse(String sentence) {
        List<Component> list = new ArrayList<>();
        String[] words = sentence.split(" ");
        Component component = new Leaf();
        for(String word : words) {
            Leaf leaf = new Leaf(word);
            list.add(leaf);
        }
        //System.out.println(list);
        return component;
    }

    public Parser getSuccessor() {
        return null;
    }
}
