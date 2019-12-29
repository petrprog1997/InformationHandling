package com.epam.handling.parser;

import com.epam.handling.composite.Component;
import com.epam.handling.composite.Composite;

public class ParagraphParser extends AbstractParser {

    public Component parse(String paragraph) {
        String [] sentences = paragraph.split("\\.");
        Component component = new Composite();
        for(String sentence : sentences) {
            getSuccessor().parse(sentence);
            //component.add(getSuccessor().parse(sentence));
        }
        return component;
    }

    public Parser getSuccessor() {
        return new SentenceParser();
    }
}
