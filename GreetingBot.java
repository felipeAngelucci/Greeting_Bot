// Created by Felipe Angelucci on 2023/10/06
/*
This is a simple Greeting Bot
that takes an input and says
hello to the user with their name.
*/

import java.util.Scanner;  // Imports the scanner class

class GreetingBot {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);  // Creates a scanner object
        System.out.println("Please enter your name.");
        String Name = Input.nextLine();  // Reads user input
        System.out.println("Hello, " + Name + "!");  // Prints user input
    }
}
