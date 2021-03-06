package com.myandroidapps.goneil.criminalintent.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by goneil on 10/1/15.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;
    private ArrayList<Crime> mCrimes;

    private CrimeLab(Context context) {
        mAppContext = context;
        mCrimes = new ArrayList<Crime>();

        fillCrimes();
    }

    public static CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime c: mCrimes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    private void fillCrimes() {
        for (int i = 0; i < 100; i ++) {
            Crime c = new Crime();
            c.setTitle("Crime #" + i);
            c.setSolved(i % 2 == 0);
            mCrimes.add(c);
        }
    }
}
