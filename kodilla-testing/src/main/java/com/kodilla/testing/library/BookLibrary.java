package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ola on 29/07/2017.
 */
public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3)
            return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20)
            return bookList;
        bookList = resultList;

        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> booksInHandsOf = new ArrayList<>();

        return booksInHandsOf;
    }
}