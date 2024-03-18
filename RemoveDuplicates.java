// Name:        Jordan Rainford
// Class:       CS 3305/Section#01
// Term:        Spring 2024
// Instructor:  Dr. Haddad
// Assignment:  6
// IDE Name:    IntelliJ IDEA

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 3) {

            System.out.println("-----------------MAIN MENU---------------\n" +
                    "1. Read input string\n" +
                    "2. Remove duplicates and display outputs\n" +
                    "3. Exit program\n" +
                    "Enter option number:");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: //reads input string
                    System.out.println("Please enter an input string: ");
                    String input = sc.nextLine();


                    break;

                case 2: //removes duplicates

                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }

    }

