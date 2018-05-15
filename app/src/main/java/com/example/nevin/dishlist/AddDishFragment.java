package com.example.nevin.dishlist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AddDishFragment extends Fragment {
    private ArrayList<Dish> dishList;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    public  AddDishFragment(){
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.add_dish_view, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        mLayoutManager = new GridLayoutManager(this.getContext(),3);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new DishListAdapter(dishList);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }
}
