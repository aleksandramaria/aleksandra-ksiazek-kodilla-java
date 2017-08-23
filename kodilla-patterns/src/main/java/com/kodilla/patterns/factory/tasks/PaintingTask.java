package com.kodilla.patterns.factory.tasks;

/**
 * Created by ola on 23/08/2017.
 */
public final class PaintingTask implements Task {
   final String taskName;
   final String color;
   final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting task to be executed.");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return true;
    }
}
