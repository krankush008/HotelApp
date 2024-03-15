package com.example.Model;

public class Food {
    Integer id;
    String foodName;
    Integer cost;

    public Food(Integer id, String foodName, Integer cost){
        this.id = id;
        this.foodName = foodName;
        this.cost = cost;
    }

    public String getFoodName(){
        return foodName;
    }

    public Integer getCost(){
        return cost;
    }
}
