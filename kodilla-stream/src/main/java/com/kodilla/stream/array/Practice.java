package com.kodilla.stream.array;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.IntStream;

class Practice
{
        public static void main(String[] args)
        {
            IntStream.rangeClosed(0, 6)
                    .forEach(System.out::println);
        }
}
