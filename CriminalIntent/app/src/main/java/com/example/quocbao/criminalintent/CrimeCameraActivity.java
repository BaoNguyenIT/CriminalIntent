package com.example.quocbao.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by QUOC BAO on 1/5/2016.
 */
public class CrimeCameraActivity extends SingleFragmentActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Hide the window title.
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Hide the status bar and other OS-level chrome
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
    }
    @Override
    public Fragment createFragment() {
        return new CrimeCameraFragment();
    }

}
