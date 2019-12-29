package com.epam.handling.sorter;

import com.epam.handling.composite.Component;
import com.epam.handling.composite.Composite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextComparatorTest {

    private TextComparator comparator = new TextComparator();

    @Test
    public void testShouldReturnTwoWhenGivenTwoComponentsWithValueLengthFiveAndThree() {
        //Given
        int givenResult = 2;
        Component component1 = new Composite("unsorted");
        Component component2 = new Composite("sorted");
        //When
        int actualResult = comparator.compare(component1, component2);
        //Then
        Assert.assertEquals(givenResult,actualResult);
    }

    @Test
    public void testShouldReturnMinusTwoWhenGivenTwoComponentsWithValueLengthTwoAndFive() {
        //Given
        int givenResult = -6;
        Component component1 = new Composite("one");
        Component component2 = new Composite("composite");
        //When
        int actualResult = comparator.compare(component1, component2);
        //Then
        Assert.assertEquals(givenResult,actualResult);
    }
}