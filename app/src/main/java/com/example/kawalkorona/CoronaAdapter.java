package com.example.kawalkorona;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoronaAdapter extends RecyclerView.Adapter<CoronaAdapter.CoronaHolder> {
    List<Atribut> coronaku;
    Activity activity;

    public CoronaAdapter(List<Atribut> coronaku, Activity activity) {
        this.coronaku = coronaku;
        this.activity = activity;
    }

    @NonNull
    @Override
    public CoronaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.rv_item,parent,false);
        return new CoronaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoronaHolder holder, int position) {

        holder.txt_provinsi.setText(coronaku.get(position).getAttributes().getProvinsi());
        int c=coronaku.get(position).getAttributes().getKasus_Posi();
        holder.txt_posi.setText(Integer.toString(c));
        int d=coronaku.get(position).getAttributes().getKasus_Semb();
        holder.txt_sembuh.setText(Integer.toString(d));
        int e=coronaku.get(position).getAttributes().getKasus_Meni();
        holder.txt_meninggal.setText(Integer.toString(e));
    }

    @Override
    public int getItemCount() { return coronaku.size(); }

    static class CoronaHolder extends RecyclerView.ViewHolder{
        TextView txt_provinsi,txt_posi,txt_sembuh,txt_meninggal;

        public CoronaHolder(@NonNull View itemView) {
            super(itemView);

            txt_provinsi=(TextView)itemView.findViewById(R.id.txt_provinsi);
            txt_posi=(TextView)itemView.findViewById(R.id.txt_posi);
            txt_sembuh=(TextView)itemView.findViewById(R.id.txt_sembuh);
            txt_meninggal=(TextView)itemView.findViewById(R.id.txt_meninggal);
        }
    }
}
