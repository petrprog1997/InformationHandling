package com.epam.handling.director;

import com.epam.handling.calculator.Client;
import com.epam.handling.exception.FileException;
import com.epam.handling.parser.FileParser;
import com.epam.handling.reader.DataReader;
import com.epam.handling.sorter.SentenceSorter;

public class Director {

    public static void main(String [] args) throws FileException {
//        DataReader reader = new DataReader();
//        String file = reader.readFile(".\\src\\main\\resources\\testFile");
//        System.out.println(file);
//        FileParser fileParser = new FileParser();
//        SentenceSorter sorter = new SentenceSorter();
//        List<Component> list = sorter.componentSort(fileParser.parse(file).getComponents());
//        System.out.println(list);
        String string = "9277*-+";
        Client client = new Client();
        System.out.println(client.calculate(string));
    }
}
