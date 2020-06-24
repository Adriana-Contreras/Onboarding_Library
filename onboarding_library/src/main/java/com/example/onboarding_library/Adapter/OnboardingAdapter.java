package com.example.onboarding_library.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.onboarding_library.Onboarding.PagDos;
import com.example.onboarding_library.Onboarding.PagTres;
import com.example.onboarding_library.Onboarding.PagWelcome;

public class OnboardingAdapter extends FragmentPagerAdapter {

    public OnboardingAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PagWelcome();
            case 1:
                return new PagDos();
            case 2:
                return new PagTres();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
