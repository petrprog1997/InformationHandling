package com.epam.handling.parser;

import com.epam.handling.composite.Component;
import com.epam.handling.composite.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileParser extends AbstractParser {

    private final String _REGEXPFORPARAGRAPH = "(?m)(?=^\\s{4})";

    public Component parse(String file) {
        Component component = new Composite();
        Component component1 = new Composite();
        String[] paragraphs = file.split(_REGEXPFORPARAGRAPH);
        for(String paragraph: paragraphs) {
            paragraph = paragraph.trim();
            component = new Composite(paragraph);
            component1.add(component);
            component = getSuccessor().parse(paragraph);

        }
        System.out.println(component1.getComponents());
        return component1;
    }

    public Parser getSuccessor() {
        return new ParagraphParser();
    }
}