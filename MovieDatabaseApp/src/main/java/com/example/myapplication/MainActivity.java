package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import adapter.UIAdapter;
import model.MovieResponse;
import model.Result;
import rest.apiinterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.widget.GridLayout.HORIZONTAL;
import static android.widget.GridLayout.VERTICAL;

public class MainActivity extends AppCompatActivity {
    private static Retrofit retrofit = null;
    private Context context;
    private RecyclerView recyclerView = null;
    private List<Result> result;
    int coloumns=9;
    private static final String TAG = "MainActivity";
    private final static String API_KEY = "0b2079d125667b4f8901cf67289c2439";
    public static final String BASE_URL = "http://api.themoviedb.org/3/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        connectAndGetApiData();


    }

// This method create an instance of Retrofit

// set the base url

    public void connectAndGetApiData() {

        if (retrofit == null) {

            retrofit = new Retrofit.Builder()

                    .baseUrl(BASE_URL)

                    .addConverterFactory(GsonConverterFactory.create())

                    .build();

        }


        apiinterface API = retrofit.create(apiinterface.class);
        Call<MovieResponse> call = API.getPopMovies(API_KEY);
        call.enqueue(new Callback<MovieResponse>() {
            @Override

            public void onResponse (Call<MovieResponse> call, Response<MovieResponse> response)
            {
                Log.e(TAG, call.request().toString());
                result = response.body().getResults();

                recyclerView.setAdapter(new UIAdapter(result, R.layout.list_item, getApplicationContext()));
            }
              @Override
            public void onFailure (Call < MovieResponse > call, Throwable throwable){
                  Log.e(TAG, throwable.toString());


            }


        });


    }


    //@Override
//public boolean onCreateOptionsMenu(Menu menu) {
//// Inflate the menu; this adds items to the action bar if it is present.
//getMenuInflater().inflate(R.menu.menu_main, menu);
//return true;
//}
//
//@Override
//public boolean onOptionsItemSelected(MenuItem item) {
//// Handle action bar item clicks here. The action bar will
//// automatically handle clicks on the Home/Up button, so long
//// as you specify a parent activity in AndroidManifest.xml.
//int id = item.getItemId();
//
////noinspection SimplifiableIfStatement
//if (id == R.id.action_settings) {
//return true;
//}
//
//return super.onOptionsItemSelected(item);
//}
}
