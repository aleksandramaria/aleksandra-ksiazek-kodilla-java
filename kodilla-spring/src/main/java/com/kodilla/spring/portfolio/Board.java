package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class Board {
    public List<TaskList> taskstoDoList = new ArrayList<>();
    public List<TaskList> inProgressList = new ArrayList<>();
    public List<TaskList> taskList = new ArrayList<>();

    public Board(TaskList list) {
        this.taskstoDoList = taskstoDoList;
        this.inProgressList = inProgressList;
        this.taskList = taskList;
    }

    public List<TaskList> getTaskstoDoList() {
        return taskstoDoList;
    }

    public List<TaskList> getInProgressList() {
        return inProgressList;
    }

    public List<TaskList> getTaskList() {
        return taskList;
    }

    public void taskAdd(TaskList task) {
        taskstoDoList.add(task);
        inProgressList.add(task);
        taskList.add(task);
    }

    @Override
    public String toString() {
        return "Board " +
                "taskstoDoList = " + taskstoDoList +
                ", inProgressList = " + inProgressList +
                ", taskList = " + taskList;
    }
}