package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ola on 27/10/2017.
 */
public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, Book> bookMap = new HashMap<>();
        for (Book book : bookSet) {
            bookMap.put(new Book(new Map.Entry<(book.getSignature(), book.getPublicationYear())>));
        }
        return medianPublicationYear();
    }
}

//    @Override
//    public double totalSalary(String[][] workers, double[] salaries) {
//        List<Employee> employeeList = new ArrayList<>();
//        for(int n = 0; n < salaries.length; n++) {
//            employeeList.add(new Employee(
//                    workers[n][0],
//                    workers[n][1],
//                    workers[n][2],
//                    new BigDecimal(salaries[n])));
//        }
//        return calculateSalaries(employeeList).doubleValue();
//    }