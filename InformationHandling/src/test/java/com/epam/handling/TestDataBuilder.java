package com.epam.handling;

import com.epam.handling.composite.Component;
import com.epam.handling.composite.Composite;
import com.epam.handling.composite.Leaf;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuilder {
    private Component component1 = new Leaf("reader");
    private Component component2 = new Leaf("is");
    private Component component3 = new Leaf("a");
    private Component component4 = new Leaf("long");
    private Component component5 = new Leaf("established");
    private Component component6 = new Leaf("facts");
    private Component component7 = new Leaf("Bye.");
    private Component component8 = new Composite("It is a long established fact that a reader will be distracted by the readable content of a page\n" +
            "when looking at its layout. The point of using 34+2-4/4-2+3 Ipsum is that it has a more-or-less normal\n" +
            "distribution of letters. as opposed to using (Content here), content here, making it look like readable\n" +
            "English.");
    private Component component9 = new Composite("It has survived - not only (five) centuries, but also the leap into 23+ electronic typesetting,\n" +
            "remaining 71- essentially 35* unchanged. It was populated. in the 71+3*4/2 with the release of\n" +
            "Letraset sheets containing Lorem. Ipsum passages, and. more recently. with desktop publishing software\n" +
            "ike Aldus PageMaker including versions of Lorem Ipsum.");
    private Component component10 = new Composite("It is a 2+2+0/1*4 established. fact that a reader will be of a page when looking at its layout.");

    private String component11 = "testfile testfile testfile testfile testfile testfile";

    public String getFile() {
        return component11;
    }

    public List<Component> sortedSentenceBuild() {
        List<Component> componentList = new ArrayList<>();
        componentList.add(component3);
        componentList.add(component2);
        componentList.add(component4);
        componentList.add(component6);
        componentList.add(component1);
        componentList.add(component5);
        return componentList;
    }

    public List<Component> unsortedSentenceBuild() {
        List<Component> componentList = new ArrayList<>();
        componentList.add(component1);
        componentList.add(component2);
        componentList.add(component3);
        componentList.add(component4);
        componentList.add(component5);
        componentList.add(component6);
        return componentList;
    }

    public List<Component> unsortedParagraphBuild() {
        List<Component> componentList = new ArrayList<>();
        componentList.add(component7);
        componentList.add(component8);
        componentList.add(component9);
        componentList.add(component10);
        return componentList;
    }

    public List<Component> sortedParagraphBuild() {
        List<Component> componentList = new ArrayList<>();
        componentList.add(component7);
        componentList.add(component10);
        componentList.add(component8);
        componentList.add(component9);
        return componentList;
    }
}
