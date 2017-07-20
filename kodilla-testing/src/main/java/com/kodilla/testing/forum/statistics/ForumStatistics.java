package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ola on 20/07/2017.
 */
public class ForumStatistics {
    Statistics statistics;
    private List<String> usersNames = new ArrayList<String>();
    private int postsCount;
    private int commentsCount;

    public ForumStatistics(Statistics statistics, int postsCount, int commentsCount) {
        this.statistics = statistics;
        this.postsCount = postsCount;
        this.commentsCount = commentsCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public Statistics getStatistics() {
        return statistics;
    }
    int avePostsPerUser(){
        return this.postsCount / usersNames.size();
    }

    int aveCommentsPerUser(){
        return this.commentsCount / usersNames.size();
    }
    int aveCommentsPerPost(){
        return this.commentsCount / this.postsCount;
    }

    public int calculateAdvStatistics(Statistics statistics) {
        return 0;
    }
}