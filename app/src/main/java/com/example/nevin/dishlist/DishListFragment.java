package com.example.nevin.dishlist;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.Toast;



import java.util.ArrayList;


public class DishListFragment extends Fragment {
    private ArrayList<Dish> dishList;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private FloatingActionButton fab;

    public DishListFragment() {
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* init dataset */
        dishList = new ArrayList<Dish>();
        ArrayList<Ingredient> schnitzelIng = new ArrayList<Ingredient>();
        schnitzelIng.add(new Ingredient("Fleisch",1,Unit.KILOGRAMS));
        schnitzelIng.add(new Ingredient("Paniermehl",200,Unit.GRAMS));
        ArrayList<String> imagesList = new ArrayList<String>();
        imagesList.add("/home/nevin/AndroidStudioProjects/Dishlist/app/src/main/res/drawable/wiener_schnitzel.jpg");
        for(int i = 0; i < 25; i++){
            Dish dish = new Dish("", imagesList, "Nevin", "Lecker Schnitzel", schnitzelIng, "kloppen, braten, essen",false);
            dish.setTitle("Schnitzel"+String.valueOf(i));
            dishList.add(dish);
        }

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dish_grid_view, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        mLayoutManager = new GridLayoutManager(this.getContext(),3);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new DishListAdapter(dishList);
        mRecyclerView.setAdapter(mAdapter);
        fab = rootView.findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO create dish creation menue
            }
        });

        return rootView;
    }
}
