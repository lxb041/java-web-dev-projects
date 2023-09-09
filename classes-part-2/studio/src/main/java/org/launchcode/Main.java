package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem(5, "Pizza: hot and delicious", "Pizza", "No");
        MenuItem item2 = new MenuItem(10, "Fried Pickles", "Fried Food", "Yes");
        MenuItem item3 = new MenuItem(16, "Oats", "Healthy Food", "Yes");
        MenuItem item4 = new MenuItem(20, "Burger", "Fast Food", "No");

        System.out.println(item1);

    }
}
