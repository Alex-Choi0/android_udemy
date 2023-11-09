package com.example.firstapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CountryViewHolder> {
    private ArrayList<String> countryNameList;
    private ArrayList<String> detailsList;
    private ArrayList<Integer> imageList;
    private Context context;

    public RecyclerAdapter(ArrayList<String> countryNameList, ArrayList<String> detailsList, ArrayList<Integer> imageList, Context context) {
        this.countryNameList = countryNameList;
        this.detailsList = detailsList;
        this.imageList = imageList;
        this.context = context;
    }

    // CountryViewHolder가 실행되면 아래 method(onCreatedViewHolder)가 실행된다.
    // 해당 method는 실질적으로 Recycle View에 xml과 연결해서 화면에 뿌려준다.
    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);
        return new CountryViewHolder(view);
    }

    // 데이터와 Recycle View를 연결해서 데이터를 전달한다.
    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

        holder.textViewCountryName.setText(countryNameList.get(position));
        holder.textViewDetails.setText(detailsList.get(position));
        holder.imageView.setImageResource(imageList.get(position));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You selected the  " + countryNameList.get(position) + " Flag", Toast.LENGTH_SHORT).show();
            }
        });

    }

    // Recycle View에 몇개의 아이템을 표시할지 리턴한다.
    @Override
    public int getItemCount() {
        return countryNameList.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewCountryName, textViewDetails;
        private ImageView imageView;
        private CardView cardView;
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewCountryName = itemView.findViewById(R.id.textViewCountryName);
            textViewDetails = itemView.findViewById(R.id.textViewDetail);
            imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
