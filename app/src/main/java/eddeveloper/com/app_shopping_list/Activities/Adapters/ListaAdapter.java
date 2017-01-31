package eddeveloper.com.app_shopping_list.Activities.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import eddeveloper.com.app_shopping_list.R;

/**
 * Created by Sunshine on 1/31/2017.
 */
public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.ViewHolder> {
    Context mycontext;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);

        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return geCount();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView,listanombre;

        public ViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.title);
            listanombre = (TextView) itemView.findViewById(R.id.Listanombre);
        }
    }

}
