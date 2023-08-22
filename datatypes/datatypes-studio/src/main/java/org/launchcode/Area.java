package org.launchcode;

import studio.areaofacircle.Circle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String prompt = "Please enter a radius: ";

        System.out.print(prompt);
        double userRadius = input.nextDouble();

        System.out.println("User entered " + userRadius);

        double area = Circle.getArea(userRadius);

        System.out.println("The area of the circle with radius " + userRadius + " is: " + area);
    }


}
