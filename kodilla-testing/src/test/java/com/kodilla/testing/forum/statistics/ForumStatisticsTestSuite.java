package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
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
        List<String> users = new List<>();
        Random theGenerator = new Random();
        for (int n=0; n<1000; n++){
            int numberOfStr = theGenerator.nextInt(10);

            StringBuilder word = new StringBuilder();

            for(int j = 0; j < numberOfStr; j++){
                word.append("bla");
            }

            users.add(word.toString());

        when(statisticsMock.usersNames().size()).thenReturn(users.size());

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        int quantityOfUsers = forumStatistics.usersNames().size();

        //Then
        Assert.assertEquals(1000, quantityOfUsers);
    }
}
