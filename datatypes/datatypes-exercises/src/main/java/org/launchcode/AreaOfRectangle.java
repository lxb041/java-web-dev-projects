package org.launchcode;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.println("Enter the width of the rectangele: ");
        double width = input.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is: " + area);

    }
}
