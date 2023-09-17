package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Scanner;

public class QuizRunner {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter 1 to create test item.");
            String mainInput = input.next();

            if (Objects.equals(mainInput, "0")) {
                System.out.println("Write the question you'd like to ask");
                String question = input.nextLine();

                System.out.println("Your question is: \n" + question);
            }
        }
    }
}
