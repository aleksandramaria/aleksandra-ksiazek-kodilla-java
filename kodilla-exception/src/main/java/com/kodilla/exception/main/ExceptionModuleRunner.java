package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;

/**
 * Created by ola on 28/07/2017.
 */
public class ExceptionModuleRunner {
    public static void main(String args[]){
        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }
}
