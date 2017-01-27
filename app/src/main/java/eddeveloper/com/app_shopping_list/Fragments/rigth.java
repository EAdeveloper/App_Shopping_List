package eddeveloper.com.app_shopping_list.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eddeveloper.com.app_shopping_list.R;

/**
 * Created by Sunshine on 1/27/2017.
 */
public class rigth extends Fragment {
    View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.rigth,container,false);

        return rootView;
    }
}
