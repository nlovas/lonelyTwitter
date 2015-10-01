package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by nlovas on 9/30/15.
 */
public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException("Duplicate Tweet");
        }
        else tweets.add(tweet);
    }

    public void delete(Tweet tweet){
    tweets.remove(tweet);
    }

    public boolean hasTweet(Tweet tweet){

    return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets(){
        return tweets;
    }


}
