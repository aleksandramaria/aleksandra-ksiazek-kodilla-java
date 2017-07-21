package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ola on 20/07/2017.
 */
public class ForumStatistics {
    Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getPostsCount() {
        return this.statistics.postsCount();
    }

    public int getCommentsCount() {
        return this.statistics.commentsCount();
    }

    public Statistics getStatistics() {
        return statistics;
    }
    int avePostsPerUser(){
        return this.statistics.commentsCount() / this.statistics.usersNames().size();
    }

    int aveCommentsPerUser(){
        return this.statistics.commentsCount() / this.statistics.usersNames().size();
    }
    int aveCommentsPerPost(){
        return this.statistics.commentsCount()/ this.statistics.postsCount();
    }

}