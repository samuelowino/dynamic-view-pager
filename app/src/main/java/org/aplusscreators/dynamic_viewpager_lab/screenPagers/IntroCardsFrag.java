package org.aplusscreators.dynamic_viewpager_lab.screenPagers;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class IntroCardsFrag extends Fragment {

   private  View currentView;

    public IntroCardsFrag() {
        // Required empty public constructor
    }

    public IntroCardsFrag(View view){

        this.currentView = view;
    }

    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_intro1, container, false);

       // currentView = getCurrentView();
        return this.currentView;
    }

}
