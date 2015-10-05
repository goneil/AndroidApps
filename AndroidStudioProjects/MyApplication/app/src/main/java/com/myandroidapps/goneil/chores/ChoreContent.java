package com.myandroidapps.goneil.chores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by goneil on 9/29/15.
 */
public class ChoreContent {
    /**
     * An array of sample (dummy) items.
     */
    public static List<Room> ITEMS = new ArrayList<Room>();

    static {
        // Add 3 sample items.
        ITEMS.add(new Room("Kitchen", null));
        ITEMS.add(new Room("Living Room", null));
        ITEMS.add(new Room("Bathroom", null));
        ITEMS.add(new Room("Bedroom", null));


        ITEMS.get(0).getChores().add(new Chore("Dish Sweep", "Pick up all dishes on tables, counters etc"));
        ITEMS.get(0).getChores().add(new Chore("Wipe Counters", "Wipe off counters and scrub them"));
        ITEMS.get(0).getChores().add(new Chore("Start Dishwasher", "Start up the dishwasher"));

    }
}
