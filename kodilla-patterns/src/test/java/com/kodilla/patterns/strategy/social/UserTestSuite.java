package com.kodilla.patterns.strategy.social;


import org.junit.Assert;
import org.junit.Test;


public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User bill = new YGeneration("Bill Clinton");
        User liam = new Millenials("Liam Hemsworth");
        User noah = new ZGeneration("Noah Cyrus");

        //When
        String billsPreferences = bill.sharePost();
        System.out.println("Bill is a " + billsPreferences);
        String liamsPreferences = liam.sharePost();
        System.out.println("Liam is a " + liamsPreferences);
        String noahsPreferences = noah.sharePost();
        System.out.println("Noah is a " + noahsPreferences);

        //Then
        Assert.assertEquals( "user of Twitter", billsPreferences);
        Assert.assertEquals( "user of Facebook", liamsPreferences);
        Assert.assertEquals( "user of Snapchat", noahsPreferences);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User phryne = new YGeneration("Phryne Fisher");

        //When
        String phrynesPreferences = phryne.sharePost();
        System.out.println("Phryne is a " + phrynesPreferences);
        phryne.setPostingPreferences(new FacebookPublisher());
        phrynesPreferences = phryne.sharePost();
        System.out.println("Phryne now is a " + phrynesPreferences);

        //Then
        Assert.assertEquals("user of Facebook", phrynesPreferences);
    }
}
