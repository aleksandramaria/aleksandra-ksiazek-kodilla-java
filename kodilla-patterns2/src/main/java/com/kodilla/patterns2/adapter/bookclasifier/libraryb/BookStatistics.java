package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.security.Signature;
import java.util.Map;

/**
 * Created by ola on 26/10/2017.
 */
public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, Book> books);
    int medianPublicationYear(Map<BookSignature, Book> books);
}
