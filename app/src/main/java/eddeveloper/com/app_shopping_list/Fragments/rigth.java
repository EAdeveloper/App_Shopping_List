package eddeveloper.com.app_shopping_list.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import eddeveloper.com.app_shopping_list.R;

/**
 * Created by Sunshine on 1/27/2017.
 */
public class rigth extends Fragment {
    View rootView;
    TextView txt;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.rigth,container,false);
        txt = (TextView) rootView.findViewById(R.id.txt1);
        return rootView;
    }
    public void ObtenerDatos(String mensaje){
        txt.setText(mensaje);
    }
}
