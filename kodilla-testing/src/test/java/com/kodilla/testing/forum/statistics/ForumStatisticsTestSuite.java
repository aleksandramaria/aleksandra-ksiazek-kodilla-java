package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ola on 21/07/2017.
 */
public class ForumStatisticsTestSuite {
   @Test
    public void testAvePostsPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        final int NUMBER_OF_POSTS = 5;
        final int NUMBER_OF_COMMENTS = 8;

        for (int n = 0; n < 1000; n++) {
            users.add("User_" + n);
        }

            when(statisticsMock.usersNames().size()).thenReturn(users.size());
            when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
            when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);


        //when
            ForumStatistics forumStatistics = new ForumStatistics();
            forumStatistics.calculateAdvStatistics(statisticsMock);


        int quantityOfUsers = forumStatistics.getUsersCount();

        //Then
        Assert.assertEquals(1000, quantityOfUsers);

    }
}

