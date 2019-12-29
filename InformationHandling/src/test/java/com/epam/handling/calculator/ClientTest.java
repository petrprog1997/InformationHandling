package com.epam.handling.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClientTest {

    Client client = new Client();

    @Test
    public void testCalculate() {

        Number result = 21;
        String given = "3319+-*";

        Number actualResult = client.calculate(given);
        Assert.assertEquals(result,actualResult);
    }
}