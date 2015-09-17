package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nlovas on 9/16/15.
 */
public class SadMood extends Mood {

    public SadMood() {
        super();
    }

    public SadMood(Date date) {
        super(date);
    }
    @Override
    public String feeling(){
        return "Sad";
    }
}
