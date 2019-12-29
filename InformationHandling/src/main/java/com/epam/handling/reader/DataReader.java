package com.epam.handling.reader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.epam.handling.composite.Component;
import com.epam.handling.exception.FileException;
import com.epam.handling.parser.FileParser;
import com.epam.handling.sorter.SentenceSorter;

public class DataReader {

   // private static final Logger _LOGGER = LogManager.getLogger(DataReader.class);

    public String readFile(String path) throws FileException {
        String file;
        try {
            file = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e){
            throw new FileException("File error",e);
        }
        return file;
    }
}
