package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;


/**
 * Created by nlovas on 9/30/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testDeleteTweet(){ //all functions must begin with test
        TweetList tweetlist = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetlist.add(tweet);
        tweetlist.delete(tweet);
        assertFalse(tweetlist.hasTweet(tweet));

    }

    public void testHasTweet(){
        TweetList tweetlist = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        assertFalse(tweetlist.hasTweet(tweet));
        tweetlist.add(tweet);
        assertTrue(tweetlist.hasTweet(tweet));

    }

    public void testAddTweet(){
        TweetList tweetlist = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetlist.add(tweet);
        assertTrue(tweetlist.hasTweet(tweet));

        Tweet tweet2 = new NormalTweet("hihihihi");
        try(tweetlist.add(tweet2))
            catch IllegalArgumentException e;
        assertFalse(tweetlist.hasTweet(tweet2));

    }

    public void testTweetCount(){

    }

    public void testGetTweet(){
        TweetList tweetlist = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetlist.add(tweet);
        Tweet returnedTweet = tweetlist.getTweet(0);
        assertTrue((tweet.date.equals(returnedTweet.date)) && (tweet.getText().equals(returnedTweet.getText())));
    }

    public void testGetTweets(){
        TweetList tweetlist = new TweetList();

        Tweet tweet = new NormalTweet("hihihihi", 2015-11-10);
        tweetlist.add(tweet);
        Tweet tweet2 = new NormalTweet("hihgiij", 2015-05-05);
        tweetlist.add(tweet2);

        TweetList t2 = new TweetList();
        t2.add(tweet);
        t2.add(tweet2);
        assertTrue(t2.equals(tweetlist));

    }

    public void testGetTweetType(){

    }

    public void testRemoveTweet(){
        
    }

}