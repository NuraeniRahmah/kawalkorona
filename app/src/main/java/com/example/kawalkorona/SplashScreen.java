package com.example.kawalkorona;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashScreen extends AppCompatActivity {
    List<Atribut> coronaku = new ArrayList<>();
    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new AmbilData().execute();
    }

    private class AmbilData extends AsyncTask<Void,Void,Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            apiInterface=ApiClient.getApiClient().create(ApiInterface.class);
            Call<List<Atribut>>call=apiInterface.getcoronaku();
            call.enqueue(new Callback<List<Atribut>>() {
                @Override
                public void onResponse(Call<List<Atribut>> call, Response<List<Atribut>> response) {
                    coronaku=response.body();
                    Intent kirim=new Intent(SplashScreen.this,MainActivity.class);
                    kirim.putExtra("barang", (Serializable) coronaku);
                    startActivity(kirim);
                    finish();

                }

                @Override
                public void onFailure(Call<List<Atribut>> call, Throwable t) {
                    Toast.makeText(SplashScreen.this,"tidak dapat data",Toast.LENGTH_LONG).show();
                }
            });
            return null;
        }
    }
}