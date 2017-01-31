package eddeveloper.com.app_shopping_list.Activities.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eddeveloper.com.app_shopping_list.R;

/**
 * Created by Sunshine on 1/31/2017.
 */
public class ListaFragment extends Fragment {
    RecyclerView recyclerView;
    private static final String TAG="RecycleViewFragment";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.lista_fragment,container,false);
        rootView.setTag(TAG);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.lista);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));


        return rootView;
    }
}
