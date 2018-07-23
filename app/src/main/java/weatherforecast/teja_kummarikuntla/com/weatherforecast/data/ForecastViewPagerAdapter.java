package weatherforecast.teja_kummarikuntla.com.weatherforecast.data;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


/**
 * Created by paulodichone on 11/16/17.
 */

public class ForecastViewPagerAdapter extends FragmentPagerAdapter {

   private List<Fragment> fragments;

    public ForecastViewPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {

        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }
}
