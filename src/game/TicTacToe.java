package game;

import java.util.Scanner;

public class TicTacToe {

    public static void getName(){

    // Declare a greetings variable
    String greeting = "Greetings ";
    String requestName = "What is your name brave Tic Tac Toe Warrior?";
    String battleReady =  ", are you ready for battle?";
    // get user input for username
    Scanner input = new Scanner(System.in);
    System.out.println(requestName);
    String userName = input.nextLine();
    System.out.println(greeting + userName + battleReady);
}
    public static void main(String[] args) {

        // store welcome message to variable and print to console
        String welcome = "Welcome to Tic Tac Toe!";
        System.out.println(welcome);
        // call getName function
        getName();

        // declare variables for count and winning number
        int count = 3;
        int winningNum = 3;

        // compare count with winningNum

        System.out.println(count == winningNum);

        // get user input for marker (number)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a marker (X or O): ");
        String userMarker = input.nextLine();
        System.out.println("You chose " + userMarker + " to mark your territory. Great choice!");

        // display true is user inputs the marker values correctly
        System.out.println((userMarker.equals("X")) || (userMarker.equals("O")));
    }
}