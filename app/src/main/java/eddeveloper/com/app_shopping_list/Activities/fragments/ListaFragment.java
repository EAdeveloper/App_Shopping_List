package eddeveloper.com.app_shopping_list.Activities.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eddeveloper.com.app_shopping_list.R;

/**
 * Created by Sunshine on 1/31/2017.
 */
public class ListaFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.lista_fragment,container,false);

        return rootView;
    }
}
