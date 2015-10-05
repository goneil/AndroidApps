package com.myandroidapps.goneil.criminalintent.view;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v13.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.myandroidapps.goneil.criminalintent.R;
import com.myandroidapps.goneil.criminalintent.model.Crime;
import com.myandroidapps.goneil.criminalintent.model.CrimeLab;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by goneil on 10/5/15.
 */
public class CrimePagerActivity extends Activity {

    private ViewPager mViewPager;
    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewPager = new ViewPager(this);
        mViewPager.setId(R.id.viewPager);
        setContentView(mViewPager);

        mCrimes = CrimeLab.get(this).getCrimes();

        mViewPager.setAdapter(new FragmentStatePagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                Crime crime = mCrimes.get(i);
                return CrimeFragment.newInstance(crime.getId());
            }

            @Override
            public int getCount() {
                return mCrimes.size();
            }
        });

        UUID crimeId = (UUID)getIntent().getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);
        for (int i = 0; i < mCrimes.size(); i ++) {
            if (mCrimes.get(i).getId().equals(crimeId)) {
                mViewPager.setCurrentItem(i);
                Crime crime = mCrimes.get(i);
                setTitle(getTitleFromCrime(crime));
                break;
            }
        }

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {
                // pass
            }

            @Override
            public void onPageSelected(int i) {
                Crime crime = mCrimes.get(i);
                setTitle(getTitleFromCrime(crime));
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    private String getTitleFromCrime(Crime c) {
        if (c.getTitle() != null) {
            return c.getTitle();
        }
        return getString(R.string.crimes_title);
    }


}
