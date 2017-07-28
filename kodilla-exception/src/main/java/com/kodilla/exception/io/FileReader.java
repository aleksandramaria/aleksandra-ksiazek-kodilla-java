package com.kodilla.exception.io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by ola on 28/07/2017.
 */
public class FileReader {
    public void readFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());

        System.out.println(file.getPath());
        Path path = Paths.get(file.getPath());
    }
}
