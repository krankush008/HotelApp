package com.example.Model;

import java.util.ArrayList;

public class Transaction {
    
    ArrayList<Food> foods; User user; ArrayList<Integer> plates;
    public Transaction(ArrayList<Food> foods, User user, ArrayList<Integer> plates){
        this.foods = foods;
        this.user = user;
        this. plates = plates;
    }

    public ArrayList<Food> getFoods(){
        return foods;
    }

    public User getUser(){
        return user;
    }

    public ArrayList<Integer> getPlates(){
        return plates;
    }
}
