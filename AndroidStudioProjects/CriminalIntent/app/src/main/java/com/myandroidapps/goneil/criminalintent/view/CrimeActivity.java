package com.myandroidapps.goneil.criminalintent.view;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.MenuItem;

import com.myandroidapps.goneil.criminalintent.R;

import java.util.UUID;


public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID)getIntent().getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }
}
