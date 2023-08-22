package org.launchcode;

import java.util.Scanner;
public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles you have driven: ");
        double numMiles = input.nextDouble();

        System.out.println("Enter how much gas you used in gallons ");
        double numGallons = input.nextDouble();

        double mpg = numMiles/numGallons;
        System.out.println("You are running on " + mpg + " mpg");
    }
}
