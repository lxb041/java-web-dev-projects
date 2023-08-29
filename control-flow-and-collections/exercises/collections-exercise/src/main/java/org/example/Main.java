package org.example;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] integerArray = {1,1,2,3,5,8};
        System.out.println("All Values");
        for (int number : integerArray) {
            System.out.println(number);
        }

        System.out.println("\nOdd Values");
        for (int number : integerArray) {
            if (number % 2 != 0)
                System.out.println(number);
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not" +
                "eat them in a house. I will not eat them with a mouse.";
                String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println(Arrays.toString(integerArray));
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void addStudents(Map<Integer, String> roster) {
        Scanner input = new Scanner(System.in);
        String newStudent;

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                roster.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();
    }
}


