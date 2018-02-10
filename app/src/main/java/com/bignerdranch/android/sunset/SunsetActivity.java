package com.bignerdranch.android.sunset;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SunsetActivity extends SingleFragmentActivity implements SunsetFragment.OnFragmentInteractionListener {

    private View mSceneView;
    private View mSunnyView;
    private View mSkyView;

    @Override
    protected Fragment createFragment() {
        return SunsetFragment.newInstance();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
