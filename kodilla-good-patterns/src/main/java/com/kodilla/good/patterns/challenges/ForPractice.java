package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

final class Book {
    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final String signature;

    public Book(final String author, final String title,
                final int yearOfPublication, final String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", signature='" + signature + '\'' +
                '}';
    }
}

final class BookDirectory {
    private final List<Book> theBookList = new ArrayList<>();

    public BookDirectory() {
        theBookList.add(new Book("Dylan Murphy", "Wolf of the mountain",
                2003, "0001"));
        theBookList.add(new Book("Phoebe Pearson", "Slaves of dreams",
                2012, "0002"));
        theBookList.add(new Book("Morgan Walsh", "Obliteration of heaven",
                2001, "0003"));
        theBookList.add(new Book("Aimee Murphy", "Rejecting the night",
                2015, "0004"));
        theBookList.add(new Book("Ryan Talley", "Gangsters and kings",
                2007, "0005"));
        theBookList.add(new Book("Madelynn Carson", "Unity without duty",
                2007, "0006"));
        theBookList.add(new Book("Giancarlo Guerrero", "Enemies of eternity",
                2009, "0007"));
    }

    public List<Book> getList() {
        return new ArrayList<>(theBookList);
    }

    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);
    }
}
