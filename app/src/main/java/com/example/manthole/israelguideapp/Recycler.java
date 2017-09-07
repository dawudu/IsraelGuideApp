package com.example.manthole.israelguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by manthole on 15 Aug 2017.
 */

public class Recycler extends RecyclerView.Adapter<Recycler.ViewHolder> {


//    ImageView imageCityView;
//    TextView txtCityName;

    Context context;
    List<Cities> citiesList;

    public Recycler(Context context, List<Cities> citiesList) {
        this.context = context;
        this.citiesList = citiesList;
    }

    @Override
    public Recycler.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cities_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(Recycler.ViewHolder holder, final int position) {

        final Cities cities;
        cities = citiesList.get(position);

        holder.imageCityView.setImageResource(cities.getImage1());
        holder.txtCityName.setText(cities.getCityName());

        holder.imageCityView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0) {
                    Intent intent = new Intent(context, Abugosh.class);
                    intent.putExtra("Abugosh", cities);
                    context.startActivity(intent);

                } else if (position == 1) {

                    Intent intent = new Intent(context, Acreakko.class);
                    intent.putExtra("Acreakko", cities);
                    context.startActivity(intent);

                } else if (position == 2) {

                    Intent intent = new Intent(context, Ashdod.class);
                    intent.putExtra("Ashdod", cities);
                    context.startActivity(intent);


                } else if (position == 3) {

                    Intent intent = new Intent(context, Haifa.class);
                    intent.putExtra("Haifa", cities);
                    context.startActivity(intent);


                } else if (position == 4) {

                    Intent intent = new Intent(context, BatShlomo.class);
                    intent.putExtra("BatShlomo", cities);
                    context.startActivity(intent);

                } else if (position == 5) {

                    Intent intent = new Intent(context, Jerusalem.class);
                    intent.putExtra("Jerusalem", cities);
                    context.startActivity(intent);


                } else if (position == 6) {


                    Intent intent = new Intent(context, TelAviv.class);
                    intent.putExtra("TelAviv", cities);
                    context.startActivity(intent);

                } else if (position == 7) {


                    Intent intent = new Intent(context, Tiberias.class);
                    intent.putExtra("Tiberias", cities);
                    context.startActivity(intent);

                }

            }
        });


    }


    @Override
    public int getItemCount() {
        return citiesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageCityView;
        TextView txtCityName;

        public ViewHolder(View itemView) {
            super(itemView);

            imageCityView = (ImageView) itemView.findViewById(R.id.ImageCity);
            txtCityName = (TextView) itemView.findViewById(R.id.txtCityName);

        }
    }
}

