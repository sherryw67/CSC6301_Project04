/**
 * Project: Sorted LinkedList Handler
 * Author: William Sherry
 * Date: 10 February, 2024
 * Version: 1.0
 * Description:
 *
 * The {@code LinkedListHandler } class encapsulates function for reading a series of
 * integer values from user, stores them in a {@link LinkedList},
 * sorts the list, then prints the sorted list in ascending value to console..
 */

//package bmt;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;



public class LinkedListHandler {

    private LinkedList<Integer> numbers = new LinkedList<>();

    /**
      * Reads integer number from console (user input) until user
      * enters 'done'. Integers that were inputed will be added
      * to {@link LinkedList}, later sorted.
      * The method handles invalid inputs by prompting the user again.
      */

    public void readNumbers() {
        System.out.println("Please enter numbers (type 'done' to finish)");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();
            if ("done".equalsIgnoreCase(input)) {
                 break; // Exits the loop when the user enters 'done'
            }
            
            try {
                int number = Integer.parseInt(input);
                 numbers.add(number); //Adds valid integers to the linked List
            } catch (NumberFormatException e) {
                 //Informs user if input was invalid and prompts again
                System.out.println("Please enter a valid integer or 'done' to finish...");
            }
        }

         Collections.sort(numbers); // Sorts the list of user inputted integers
    }

    /**
      * Prints the sorted list to console. Printed in ascending order based on
      * what was stored inside of {@link LinkedList}.
      */

    public void printNumbers() {
        System.out.println("Sorted Numbers: " + numbers);
    }
    
}
