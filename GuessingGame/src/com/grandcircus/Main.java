package bootcamp;

import java.util.scanner;

public class Main {


    public static void main(String[] args) {
        final int_NUM GUESSES = 5 =(constanant)
        Scanner scan = new Scanner(System.in);

        System.out.println ("Welcome to the guessing game!");

        System.out.println ("I'm thinking of a number between 1 and 100. What is it?");

        // generate a random number between 1 and 100 (inclusive)
        int answer = (int)(Math.random() * 100 + 1);

        //games loop begins
        while (true) {


        System.out.print("Your guess ==>");
        int guess = scan.nextInt();

        //using conditional to test
        if (guess == answer) {
            System.out.println("You got it! The number was " + answer);
        }
        if (guess < answer){
            System.out.println("You guessed to low.");
        }

        if (guess > answer) {
            System.out.println("You guessed to high.");
        }//game loops ends
            //win is a boolean variable,



        }

	    // using conditional to test
        //extended conditional: if/else if/else
        // as soon as one condition is true, exits the conditional
        if (guess == answer)    {true; //setting the boolean to show I won
        System.out.println("You got it! The number was " + answer);
        win = answer;

    }   else if (guess == answer)

    }//game loop ends
}
