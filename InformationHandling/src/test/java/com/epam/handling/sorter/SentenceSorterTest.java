package com.epam.handling.sorter;

import com.epam.handling.TestDataBuilder;
import com.epam.handling.composite.Component;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class SentenceSorterTest {

    private TestDataBuilder builder = new TestDataBuilder();
    private SentenceSorter sorter = new SentenceSorter();

    @Test
    public void testShouldReturnSortedListWhenUnsortedListIsGiven() {
        //Given
        List<Component> givenSortedList = builder.sortedSentenceBuild();
        List<Component> givenUnsortedList = builder.unsortedSentenceBuild();
        //When
        List<Component> resultedSortedList = sorter.componentSort(givenUnsortedList);
        //Then
        Assert.assertEquals(givenSortedList,resultedSortedList);
    }
}