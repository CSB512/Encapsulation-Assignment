//Assignment 1
//by Chevaughn Joseph
//Student ID: 2018081122

import java.util.*;
import java.text.DecimalFormat;
import java.lang.Double;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) throws Exception {
        // Variables
        Circle newCircle = new Circle();
        try (Scanner input = new Scanner(System.in)) {
            //User input requested
            System.out.print("Please enter the value of the circle's radius: ");
            String userRadius = input.nextLine();
            double radius = Double.parseDouble(userRadius);
            System.out.print("If you wish to find the area of the circle, enter 1. \nIf you wish to find the circumference of the circle, enter 2. :");
            String userChoice = input.nextLine();

            //evaluating user input
            switch (userChoice) {
                case "1":
                case "one":
                case "One":
                    System.out.println("The area of the circle is: " + df.format(newCircle.Area(radius)));
                    break;
                case "2":
                case "two":
                case "Two":
                    System.out.println("The circumference of the circle is: " + df.format(newCircle.Circumference(radius)));
                    break;
                default:
                    System.out.println("Please enter either the number one or the number 2");
            }
        }
        
    }
}
