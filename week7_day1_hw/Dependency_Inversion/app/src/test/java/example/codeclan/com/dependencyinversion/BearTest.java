package example.codeclan.com.dependencyinversion;

/**
 * Created by user on 27/06/2017.
 */

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import example.codeclan.com.dependencyinversion.Diary;

public class BearTest{

    Bear bear;
    Diary journal;

    @Before
    public void setup(){
        bear = new Bear();
        journal = new Diary();
    }

    @Test
    public void hasJournal(){
        bear.getJournal().write("Dear diary, mood: apathetic...");
        assertEquals("Dear diary, mood: apathetic...", bear.getJournal().readLast());
    }
}