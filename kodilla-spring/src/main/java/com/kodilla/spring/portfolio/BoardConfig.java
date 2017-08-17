package com.kodilla.spring.portfolio;

import com.kodilla.stream.portfolio.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.print.Book;
import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("list1")
    TaskList list;

    @Bean
    public Board getBoard() {
      return new Board(list);
    }

    @Bean(name = "list1")
    @Scope("prototype")
    public TaskList getListOne() {
        return new TaskList();
    }

    @Bean(name = "list2")
    @Scope("prototype")
    public TaskList getListTwo() {
        return new TaskList();
    }

    @Bean(name = "list3")
    @Scope("prototype")
    public TaskList getListThree() {
        return new TaskList();
    }
}
