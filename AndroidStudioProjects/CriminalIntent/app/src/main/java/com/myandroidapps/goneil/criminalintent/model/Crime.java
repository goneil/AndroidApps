package com.myandroidapps.goneil.criminalintent.model;

import java.util.Date;
import java.util.UUID;

/**
 * Created by goneil on 9/30/15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        // Generate UUID
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date pDate) {
        mDate = pDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean pSolved) {
        mSolved = pSolved;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
