package com.example.newsapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class ThirdActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> address = new ArrayList<>();
    ArrayList<String> hq = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        try{
            JSONObject obj = new JSONObject(loadJSONfromAssets());

            JSONArray userArray = obj.getJSONArray("offices");

            for(int i=0; i<userArray.length(); i++){
                JSONObject userDetail = userArray.getJSONObject(i);
                name.add(userDetail.getString("name"));
                address.add(userDetail.getString("address"));
                hq.add(userDetail.getString("headquarter"));
            }
        } catch (JSONException e){
            e.printStackTrace();
        }

        CustomAdapter customAdapter= new CustomAdapter(name,address,hq,ThirdActivity.this);
        recyclerView.setAdapter(customAdapter);

    }
    private String loadJSONfromAssets(){
        String json = null;

        try{
            InputStream is = getAssets().open("offices.json");
            int size = is.available();

            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer,"UTF-8");

        } catch (IOException e){
            e.printStackTrace();
            return null;

        }

        return json;
    }
}