package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class Dep2Activity extends AppCompatActivity {

    private ArrayList<Employee> mEmployeeList;
    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private Button buttonInsert;
    private Button buttonRemove;
    private EditText editTextInsert;
    private EditText editTextRemove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d2);
        createExampleList();
        buildRecyclerView();
        setButtons();
    }
    public void insertItem(int position) {
        mEmployeeList.add(position, new Employee(R.drawable.ic_android, "New Employee" , "Job TBD"));
        mAdapter.notifyItemInserted(position);
    }
    public void removeItem(int position) {
        mEmployeeList.remove(position);
        mAdapter.notifyItemRemoved(position);
    }
    public void changeItem(int position, String text) {
        mEmployeeList.get(position).changeText1(text);
        mAdapter.notifyItemChanged(position);
    }
    public void createExampleList() {
        mEmployeeList = new ArrayList<>();
        mEmployeeList.add(new Employee(R.drawable.ic_android, "Gabriel Georgescu", "Maintenance Engineer"));
        mEmployeeList.add(new Employee(R.drawable.ic_audio, "Darius Ioan", "Electrical Design Engineer"));
        mEmployeeList.add(new Employee(R.drawable.ic_sun, "Stefan Alexandrescu", "Intern"));
        mEmployeeList.add(new Employee(R.drawable.ic_audio, "Marius Panait", "Quality Assurance"));
        mEmployeeList.add(new Employee(R.drawable.ic_sun, "Bogdan Dobrescu", "Hardware Inspector"));
    }
    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mEmployeeList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                changeItem(position, "Clicked");
            }
            @Override
            public void onDeleteClick(int position) {
                removeItem(position);
            }
        });
    }
    public void setButtons() {
        buttonInsert = findViewById(R.id.button_insert);
        buttonRemove = findViewById(R.id.button_remove);
        editTextInsert = findViewById(R.id.edittext_insert);
        editTextRemove = findViewById(R.id.edittext_remove);
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt(editTextInsert.getText().toString());
                insertItem(position);
            }
        });
        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt(editTextRemove.getText().toString());
                removeItem(position);
            }
        });
    }
}
