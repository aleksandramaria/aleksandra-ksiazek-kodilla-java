package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by ola on 27/10/2017.
 */
public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("A twist in the tale", "Jeffrey Archer", 1988, "ARC"));
        books.add(new Book("The Book Thief", "Markus Zusak", 2005, "ZUS"));
        books.add(new Book("Animal farm", "George Orwell", 1945, "ORW"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println(median);
        assertEquals(median, 1988, 0);
    }
}
