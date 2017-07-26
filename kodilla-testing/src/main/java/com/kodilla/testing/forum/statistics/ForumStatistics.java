package com.kodilla.testing.forum.statistics;


/**
 * Created by ola on 20/07/2017.
 */
public class ForumStatistics {
    private int postCount;
    private int commentsCount;
    private int usersCount;
    private double averagePostsPerUser;
    private double averageCommentsPerPost;
    private double averageCommentsPerUser;


    public ForumStatistics() {
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.postCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        this.usersCount = statistics.usersNames().size();

        if(this.usersCount == 0) {
            this.averagePostsPerUser = 0;
        } else {
            this.averagePostsPerUser = this.postCount/this.usersCount;
        }
        this.averageCommentsPerPost = this.commentsCount/this.postCount;
        this.averageCommentsPerUser = this.commentsCount/this.usersCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }
}