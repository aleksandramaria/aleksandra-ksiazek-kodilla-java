package com.kodilla.patterns.factory.tasks;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ola on 23/08/2017.
 */
public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.addNewTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("shopping list", shoppingTask.getTaskName());
        Assert.assertFalse(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.addNewTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("debenhams job", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.addNewTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("delivery of grapes", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());

    }
}

