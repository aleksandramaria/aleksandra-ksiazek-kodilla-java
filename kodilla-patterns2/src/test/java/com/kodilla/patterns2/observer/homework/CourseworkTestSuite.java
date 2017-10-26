package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ola on 27/10/2017.
 */
public class CourseworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Coursework javaApiHomework = new JavaApiHomework();
        Coursework javaPatternsHomework = new JavaPatternsHomework();
        Mentor adrianPazucha = new Mentor("adrian");
        Mentor maciekOleksy = new Mentor("maciek");
        Mentor jamesBrown = new Mentor("jim");
        javaApiHomework.registerObserver(adrianPazucha);
        javaApiHomework.registerObserver(maciekOleksy);
        javaPatternsHomework.registerObserver(adrianPazucha);
        javaPatternsHomework.registerObserver(jamesBrown);
        //When
        javaApiHomework.addAssignment("new assignment ready to check :)");
        javaApiHomework.addAssignment("ready homework");
        javaPatternsHomework.addAssignment("coursework ready");
        //Then
        assertEquals(3, adrianPazucha.getUpdateCount());
        assertEquals(2, maciekOleksy.getUpdateCount());
        assertEquals(1, jamesBrown.getUpdateCount());
    }
}