package com.myandroidapps.goneil.chores;

import java.util.List;

/**
 * Created by goneil on 9/29/15.
 */
public class Room {
    private String mRoomName;

    public String getRoomName() {
        return mRoomName;
    }

    public void setRoomName(String mRoomName) {
        this.mRoomName = mRoomName;
    }

    private List<Chore> mChores;

    public List<Chore> getChores() {
        return mChores;
    }

    public void setChores(List<Chore> mChores) {
        this.mChores = mChores;
    }

    public Room(String roomName, List<Chore> chores) {
        mRoomName = roomName;
        mChores = chores;
    }

    public String toString() {
        return mRoomName;
    }
}
