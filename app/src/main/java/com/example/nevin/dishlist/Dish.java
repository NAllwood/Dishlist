package com.example.nevin.dishlist;

import android.media.Image;
import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String title;
    private ArrayList<String> images;
    private String author;
    private String description;
    private ArrayList<Ingredient> ingredientList;
    private String instruction;
    private boolean isSelected;

    public Dish(String title, ArrayList<String> images, String author, String description, ArrayList<Ingredient> ingredientList, String instruction, boolean isSelected) {
        this.title = title;
        this.images = images;
        this.author = author;
        this.description = description;
        this.ingredientList = ingredientList;
        this.instruction = instruction;
        this.isSelected = isSelected;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImage(ArrayList<String> images) {
        this.images = images;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(ArrayList<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
