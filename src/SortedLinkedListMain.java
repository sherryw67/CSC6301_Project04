/**
 * Project: Sorted LinkedList Handler
 * Author: William Sherry
 * Date: 10 February, 2024
 * Version: 1.0
 * Description:
 *
 * The {@code SortedLinkedListMain} class is an entry point
 * Collects user input for integers and sorts those numbers
 * then printing them into a sorted list.
 */
//package bmt;

public class SortedLinkedListMain {
    
    /**
     * This main method initiates process for reading, sorting,
     * then printing the list of integers the user provided
     *
     * @param args command-line arguments (not used in this application.)
     */

    public static void main(String[] args) {
        LinkedListHandler handler = new LinkedListHandler();
        handler.readNumbers();
        handler.printNumbers();

    }

}
