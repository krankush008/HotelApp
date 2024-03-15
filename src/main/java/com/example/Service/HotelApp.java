package com.example.Service;

import java.util.ArrayList;

import com.example.Model.Transaction;
import com.example.Model.User;
import com.example.Model.Food;

public class HotelApp {
    
    public void addFood(ArrayList<Food> foods, User user, ArrayList<Integer> plates){
        Transaction transaction = new Transaction(foods, user, plates);
        printTransaction(transaction);
    }

    public void printTransaction(Transaction transaction){
        System.out.println("Customer name = "+transaction.getUser().getUserName());
        for(int i=0;i<transaction.getFoods().size();i++){
            System.out.println("Food name = "+transaction.getFoods().get(i).getFoodName()+" Cost = "+transaction.getFoods().get(i).getCost()+" no of plates = "+transaction.getPlates().get(i));
        }
    }
}
