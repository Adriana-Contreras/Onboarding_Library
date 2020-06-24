package com.example.onboarding_library.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.onboarding_library.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PagTres extends Fragment {

    private TextView next3, prev3;
    private ViewPager viewPager;
    private View view;

    public PagTres() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //initialize view pager from main activity
        _initializeInflater(inflater, container);

        //initialize components
        _initialize();

        //add click event to text Next and prev text
        _addClickDoneAndPrev();

        //return
        return view;

    }
    public void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_pag_tres, container, false);
    }

    public void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        next3 = view.findViewById(R.id.Next3);
        prev3 = view.findViewById(R.id.Prev3);
    }

    public void _addClickDoneAndPrev() {
        next3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

        prev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
    }


}
