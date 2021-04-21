package com.example.cycelview;

import java.util.ArrayList;

public class Type {
    private String title;
    private ArrayList<Store> storeArrayList;

    public Type(String title, ArrayList<Store> storeArrayList) {
        this.title = title;
        this.storeArrayList = storeArrayList;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Store> getStoreArrayList() {
        return storeArrayList;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStoreArrayList(ArrayList<Store> storeArrayList) {
        this.storeArrayList = storeArrayList;
    }
}
