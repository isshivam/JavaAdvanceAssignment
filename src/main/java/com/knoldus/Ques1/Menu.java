package com.knoldus.Ques1;
import java.util.ArrayList;
import java.time.LocalTime;

public class Menu {

//        Here we are declaring an arraylist of menuList as class variable
    static ArrayList<Dish> menuList;

//      here we are Using static block
    static {
//       Adding some dishes by using Dish class
        Dish chicken_Korma = new Dish(1, "Chicken Korma", LocalTime.now());
        Dish chicken_Biryani = new Dish(2, "Chicken Biryani", LocalTime.now());
        Dish chicken_Kabab = new Dish(3, "Chicken Kabab", LocalTime.now());
        Dish Karahi_paneer = new Dish(4, "Karahi Paneer", LocalTime.now());
        Dish Rajma_Chawal= new Dish(5, "Rajma Chawal", LocalTime.now());


//       Adding all created dishes to arraylist
        menuList = new ArrayList<Dish>();
        menuList.add(chicken_Korma);
        menuList.add(chicken_Biryani);
        menuList.add(chicken_Kabab);
        menuList.add(Karahi_paneer);
        menuList.add(Rajma_Chawal);
    }
}
