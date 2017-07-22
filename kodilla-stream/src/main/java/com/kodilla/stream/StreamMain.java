package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("beautifying the strings process");
        String one = poemBeautifier.beautify("one", (str) -> str.toUpperCase());
        String two =  poemBeautifier.beautify("For", (str) -> str.toLowerCase());
        String three = poemBeautifier.beautify("allinclusive", (str) -> str.substring(0, 3));
        String four = poemBeautifier.beautify("man", (str) -> str + ("kind"));
        System.out.println(one + " " + two + " " + three + " " + four);




    }
}


