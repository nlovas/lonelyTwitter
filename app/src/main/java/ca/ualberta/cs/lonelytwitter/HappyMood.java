package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nlovas on 9/16/15.
 */
public class HappyMood extends Mood {

    public HappyMood() {
        super();
    }

    public HappyMood(Date date) {
        super(date);
    }
    @Override
    public String feeling(){
        return "Happy";
    }
}
