import java.util.Scanner;

/**
 * Created by Nicole and William on 2/9/2017.
 */
public class Bowling {
    public static void main(String[] args) {
        int[] frames = new int[10];
        int total = 0;

        //variable for logical size
        //how many elements are actually filled
        int logSize = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Bowling Tracker!");

        for (int i = 0; i < frames.length; i++) {
            System.out.print("Please enter a score: ");
            int score = scan.nextInt();

            if (score < 0) {
                System.out.println("Input complete.  Thank you!");
                break;//exit the loop
            } else { //if positice
                //increment logical size
                logSize++;

                //store the value
                frames[i] = score;

                //add to the total here instead of a separate loop
                total += score;
            }
        }

        //could do this in a second loop or up above
        //enhanced for loop example:
//        for (int f: frames) {
//            total += f;
//        }

        //final output
        System.out.println("Number of scores entered: " + logSize);

        //output just the filled elements
        for (int i = 0; i < logSize; i++) {
            //example of displaying 1-10 even though elements are 0-9
            System.out.println("Frame #" + (i + 1) + ": " + frames[i]);
        }

        System.out.println("Score total: " + total);

        //use the logical size, not the physical size frames.length
        double average = (double)total / logSize;
        System.out.println("Average frame: " + average);
    }
}










