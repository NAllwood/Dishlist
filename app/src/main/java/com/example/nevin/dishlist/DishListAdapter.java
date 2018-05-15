package com.example.nevin.dishlist;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DishListAdapter extends RecyclerView.Adapter<DishListAdapter.ViewHolder> {

    private ArrayList<Dish> dishList;
    private ArrayList<Dish> selectedList;

    public DishListAdapter(ArrayList<Dish> dishList) {
        this.dishList = dishList;
        //TODO load
        selectedList = new ArrayList<Dish>();
        setHasStableIds(true);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView itemImage;
        public TextView itemTitle;
        public CheckBox itemCheckbox;

        public ViewHolder(View v) {
            super(v);
            itemImage = v.findViewById(R.id.itemImage);
            itemTitle = v.findViewById(R.id.itemTitle);
            itemCheckbox = v.findViewById(R.id.itemCheckBox);
        }
    }


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dish_item_view, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        final Dish dish = dishList.get(position);

        holder.itemImage.setImageResource(R.drawable.wiener_schnitzel);
        holder.itemTitle.setText(dish.getTitle());

        if(selectedList.contains(dish) && holder.itemCheckbox.isChecked() == false){
            holder.itemCheckbox.callOnClick();
        }

        holder.itemCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               // Toast.makeText(buttonView.getContext(), "ischecked="+String.valueOf(isChecked), Toast.LENGTH_SHORT).show();
                if(!isChecked && selectedList.contains(dish)){
                    Toast.makeText(buttonView.getContext(), "Removed "+dish.getTitle()+" from selected", Toast.LENGTH_SHORT).show();
                    selectedList.remove(dish);
                }else if(isChecked && !selectedList.contains(dish)){
                    Toast.makeText(buttonView.getContext(), "Added "+dish.getTitle()+" to selected", Toast.LENGTH_SHORT).show();
                    selectedList.add(dish);
                }
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Clicked On "+dish.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public long getItemId(int position) {
        return position;
    }

    public int getItemViewType(int position) {
        return position;
    }


    public int getItemCount() {
        return dishList.size();
    }


}
