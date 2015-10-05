package com.myandroidapps.goneil.criminalintent.utilities;

import android.text.format.DateFormat;

import java.util.Date;

/**
 * Created by goneil on 10/2/15.
 */
public class DateUtilities {
    public static String crimeFormattedDate(Date d) {
        DateFormat df = new DateFormat();
        String formattedDate = df.format("EEEE, MMM d, yyyy.", d).toString();
        return formattedDate;
    }
}
