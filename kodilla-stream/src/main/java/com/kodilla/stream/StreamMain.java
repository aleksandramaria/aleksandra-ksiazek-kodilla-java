package com.kodilla.stream;


import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forum.Forum;
import com.kodilla.stream.forum.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theMapOfUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 1997)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        System.out.println("# elements: " + theMapOfUsers.size());
        theMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}

////import com.kodilla.stream.beautifier.PoemBeautifier;
//
////public class StreamMain {
////    public static void main(String[] args) {
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        System.out.println("beautifying the strings process");
//
//        String one = poemBeautifier.beautify("one", (bla) -> bla.toUpperCase());
//        String two = poemBeautifier.beautify("For", (string) -> string.toLowerCase());
//        String three = poemBeautifier.beautify("allinclusive", (str) -> str.substring(0, 3));
//        String four = poemBeautifier.beautify("man", (str) -> str + ("kind"));
//
//        System.out.println(one + " " + two + " " + three + " " + four);
//    }
//}