package com.kodilla.spring.portfolio;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class TaskList {
    List<String> tasks;
    String name;

    public TaskList(String name) {
        tasks = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "tasks = " + tasks;
    }
}
