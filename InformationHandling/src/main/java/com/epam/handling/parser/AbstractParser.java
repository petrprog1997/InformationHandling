package com.epam.handling.parser;

public abstract class AbstractParser implements Parser {


    private Parser successor;

    public void setSuccessor(Parser successor) {
        this.successor = successor;
    }

    public abstract Parser getSuccessor();
}
