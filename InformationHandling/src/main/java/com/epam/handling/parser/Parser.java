package com.epam.handling.parser;

import com.epam.handling.composite.Component;
import com.epam.handling.composite.Composite;

import java.util.*;

public interface Parser {

    Component parse(String line);
}
