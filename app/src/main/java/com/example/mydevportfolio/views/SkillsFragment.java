package com.example.mydevportfolio.views;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mydevportfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SkillsFragment extends Fragment {


    public SkillsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View skillsfragment = inflater.inflate(R.layout.fragment_skills, container, false);
        // Inflate the layout for this fragment
        return skillsfragment;
    }

}
