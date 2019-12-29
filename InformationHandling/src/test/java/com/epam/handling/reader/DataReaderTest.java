package com.epam.handling.reader;

import com.epam.handling.exception.FileException;
import com.epam.handling.TestDataBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataReaderTest {

    private DataReader reader = new DataReader();
    private TestDataBuilder builder = new TestDataBuilder();

    @Test
    public void testReadFile() throws FileException {
        //Given
        String givenFile = builder.getFile();
        //When
        String actualFile = reader.readFile(".\\src\\test\\resources\\testFile");
        //Then
        Assert.assertEquals(givenFile,actualFile);

    }
}