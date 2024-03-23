import static org.junit.Assert.*;
import org.junit.Test;

import com.example.Model.Food;
import com.example.Model.Transaction;
import com.example.Model.User;
import com.example.Service.HotelApp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class HotelAppTest {

    @Test
    public void testAddExpense() {

        // Create sample data

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
        Transaction transaction = hotelApp.addFood(foods, user, plates);
        hotelApp.showOrderedListUser(user);
        Transaction transactionTest = new Transaction(foods, user, plates);
        assertEquals(transactionTest.getFoods(), transaction.getFoods());
        assertEquals(transactionTest.getPlates(), transaction.getPlates());
        assertEquals(transactionTest.getUser(), transaction.getUser());
        
    }

    @Test
    public void testPrintMessage() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        
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
        Transaction transaction = hotelApp.addFood(foods, user, plates);
        hotelApp.showOrderedListUser(user);

        // Check if the message was printed
        assertEquals("Customer name = Ankush\nFood name = Idli Cost = 200 no of plates = 4\n" + //
                        "Food name = Samber Cost = 150 no of plates = 6\n" + //
                        "Food name = Chilla Cost = 60 no of plates = 9\n" + //
                        "Food name = Dosa Cost = 70 no of plates = 4\n" + //
                        "Customer name = Ankush\n" + //
                        "Food name = Idli Cost = 200 no of plates = 4\n" + //
                        "Food name = Samber Cost = 150 no of plates = 6\n" + //
                        "Food name = Chilla Cost = 60 no of plates = 9\n" + //
                        "Food name = Dosa Cost = 70 no of plates = 4\n", outContent.toString());

        // Restore original System.out
        System.setOut(System.out);
    }
}
