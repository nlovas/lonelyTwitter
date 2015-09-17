package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by nlovas on 9/16/15.
 */
public abstract class Tweet extends Object implements Tweetable{
    private String text;
    protected Date date;
    protected ArrayList<Mood> Moodlist = new ArrayList<Mood>();

    public Tweet(String tweet, Date date) throws IOException {
        this.setText(tweet);
        this.date = date;
    }

    public Tweet(String tweet) {
        this.setText(tweet);
        this.date = new Date();
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public void setText(String text) {

            if (text.length() <= 140) {
                this.text = text;
            } else {
                throw new IllegalArgumentException("Tweet was too long!");
            }

    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();


}
