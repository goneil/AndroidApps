package com.myandroidapps.goneil.criminalintent.view;

import android.app.Fragment;

/**
 * Created by goneil on 10/1/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
