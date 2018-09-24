package com.example.quocbao.criminalintent;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

/**
 * Created by QUOC BAO on 10/5/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {


    @Override
    public Fragment createFragment(){
        return new CrimeListFragment();
    }
}
