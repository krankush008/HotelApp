package com.example;

import java.util.ArrayList;

import com.example.Model.Food;
import com.example.Model.User;
import com.example.Service.HotelApp;

public class Main {
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<Food>(); 
        User user = new User(1, "Ankush"); 
        ArrayList<Integer> plates = new ArrayList<>();
        plates.add(4);
        plates.add(6);
        plates.add(9);
        plates.add(4);
        Food food1 = new Food(1, "Idli", 200);
        Food food2 = new Food(5, "Samber", 150);
        Food food3 = new Food(7, "Chilla", 60);
        Food food4 = new Food(2, "Dosa", 70);
        foods.add(food1);
        foods.add(food2);
        foods.add(food3);
        foods.add(food4);
        HotelApp hotelApp = new HotelApp();
        hotelApp.addFood(foods, user, plates);
    }
}