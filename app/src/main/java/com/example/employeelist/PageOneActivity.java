package com.example.employeelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AbsListView;

import retrofit2.Retrofit;

public class PageOneActivity extends AppCompatActivity implements RecyclerViewAdapter.UserDataInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);
        onCreateAPI();
    }
    void onCreateAPI(){
        Retrofit retrofit = RetrofitBuilder.getInstance();

    }

}