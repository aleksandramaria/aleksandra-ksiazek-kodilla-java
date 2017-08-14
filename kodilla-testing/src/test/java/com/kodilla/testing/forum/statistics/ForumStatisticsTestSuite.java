package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
   @Test
    public void testWhenMoreCommentsThanPosts() {
       //Given
       Statistics statisticsMock = mock(Statistics.class);
       List<String> users = new ArrayList<>();
       final int NUMBER_OF_POSTS = 200;
       final int NUMBER_OF_COMMENTS = 400;

       for (int n = 0; n < 100; n++) {
            users.add("User_" + n);
       }

       when(statisticsMock.usersNames()).thenReturn(users);
       when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
       when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);


       //when
       ForumStatistics forumStatistics = new ForumStatistics();
       forumStatistics.calculateAdvStatistics(statisticsMock);


       int quantityOfUsers = forumStatistics.getUsersCount();
       double postPerUser = forumStatistics.getAveragePostsPerUser();
       double commentsPerUser = forumStatistics.getAverageCommentsPerUser();
       double commentsPerPost = forumStatistics.getAverageCommentsPerPost();

       //Then
       Assert.assertEquals(100, quantityOfUsers, 0);
       Assert.assertEquals(2, postPerUser, 0);
       Assert.assertEquals(4, commentsPerUser, 0);
       Assert.assertEquals(2, commentsPerPost, 0);

    }

    @Test
    public void testWhenZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        final int NUMBER_OF_POSTS = 1000;
        final int NUMBER_OF_COMMENTS = 0;

        for (int n = 0; n < 100; n++) {
            users.add("User_" + n);
        }

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
        when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);


        //when
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);


        int quantityOfUsers = forumStatistics.getUsersCount();
        double postPerUser = forumStatistics.getAveragePostsPerUser();
        double commentsPerUser = forumStatistics.getAverageCommentsPerUser();
        double commentsPerPost = forumStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(100, quantityOfUsers);
        Assert.assertEquals(10, postPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);

    }
    @Test
    public void testWhenMorePostsThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        final int NUMBER_OF_POSTS = 100;
        final int NUMBER_OF_COMMENTS = 50;

        for (int n = 0; n < 100; n++) {
            users.add("User_" + n);
        }

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
        when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);


        //when
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);


        int quantityOfUsers = forumStatistics.getUsersCount();
        double postPerUser = forumStatistics.getAveragePostsPerUser();
        double commentsPerUser = forumStatistics.getAverageCommentsPerUser();
        double commentsPerPost = forumStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(100, quantityOfUsers);
        Assert.assertEquals(1, postPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0.001);
        Assert.assertEquals(0, commentsPerPost, 0.001);

    }
    @Test
    public void testWhenNumberOfUsersZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        final int NUMBER_OF_POSTS = 100;
        final int NUMBER_OF_COMMENTS = 5;

        for (int n = 0; n < 0; n++) {
            users.add("User_" + n);
        }

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
        when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);


        //when
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);


        int quantityOfUsers = forumStatistics.getUsersCount();
        double postPerUser = forumStatistics.getAveragePostsPerUser();
        double commentsPerUser = forumStatistics.getAverageCommentsPerUser();
        double commentsPerPost = forumStatistics.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, quantityOfUsers);
        Assert.assertEquals(0, postPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);

    }
}

