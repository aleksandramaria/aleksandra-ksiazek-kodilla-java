package com.kodilla.katas;

/**
 * Created by ola on 29/03/2018.
 */

import java.util.Arrays;

//public class AreSame {
//
//    public static boolean comp(int[] a, int[] b) {
//        if (a == null || b == null) return false;
//        if (a.length != b.length) return false;
//
//        Arrays.sort(a);
//        Arrays.sort(b);
//        for (int i = 0; i < a.length; i++) {
//            if (a[i]*a[i] != b[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null) return false;
        if (a.length != b.length) return false;

        int[] sortedA = Arrays.stream(a).map(x -> x*x).sorted().toArray();
        int[] sortedB = Arrays.stream(b).sorted().toArray();
        return Arrays.equals(sortedA, sortedB);
    }
}