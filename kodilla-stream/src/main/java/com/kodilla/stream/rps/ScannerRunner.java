package com.kodilla.stream.rps;

import java.io.File;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerRunner {

    public static void main(String[] args) {
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();

        String input1 = "1 fish 2 fish red fish blue fish";
        Scanner s1 = new Scanner(input1);
        s1.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
        MatchResult result = s1.match();
        for (int i=1; i<=result.groupCount(); i++)
            System.out.println(result.group(i));
        s1.close();


        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();


//        Scanner sc = new Scanner(new File("myNumbers"));
//        while (sc.hasNextLong()) {
//            long aLong = sc.nextLong();
//        }
    }
}
