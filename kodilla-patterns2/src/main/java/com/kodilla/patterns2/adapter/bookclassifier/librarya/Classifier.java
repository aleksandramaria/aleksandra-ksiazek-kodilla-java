package com.kodilla.patterns2.adapter.bookclassifier.librarya;

import java.util.Set;

/**
 * Created by ola on 26/10/2017.
 */
public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}
