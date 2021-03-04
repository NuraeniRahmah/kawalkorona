package com.example.kawalkorona;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    List<Atribut> coronamu;
    RecyclerView rvcorona;
    RecyclerView.LayoutManager layoutnya;
    CoronaAdapter adapternya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvcorona=(RecyclerView)findViewById(R.id.rv_corona);
        layoutnya=new LinearLayoutManager(this);
        rvcorona.setLayoutManager(layoutnya);
        Intent dapet=getIntent();
        coronamu= (List<Atribut>) dapet.getSerializableExtra("barang");
        adapternya=new CoronaAdapter(coronamu,MainActivity.this);
        rvcorona.setAdapter(adapternya);

    }
}

