package com.epam.handling.sorter;

import com.epam.handling.TestDataBuilder;
import com.epam.handling.composite.Component;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ParagraphSorterTest {

    private TestDataBuilder builder = new TestDataBuilder();
    private ParagraphSorter sorter = new ParagraphSorter();

    @Test
    public void testComponentSort() {
        //Given
        List<Component> givenSortedList = builder.sortedParagraphBuild();
        List<Component> givenUnsortedList = builder.unsortedParagraphBuild();
        //When
        List<Component> resultedSortedList = sorter.componentSort(givenUnsortedList);
        //Then
        Assert.assertEquals(givenSortedList,resultedSortedList);
    }
}