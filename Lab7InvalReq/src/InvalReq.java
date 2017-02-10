import java.util.Scanner;

/**
 * Created by Nicole on 2/8/2017.
 */
public class InvalReq {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                String[] words = new String[3];

                words[0] = "Hello";
                words[1] = "to";
                words[2] = "Java class";

                System.out.println(words[0] +  words[1] + words[2]);


                System.out.println("Which student would you like to learn about?");
                int number = scan.nextInt();


                String[] student = {"Helen","Nicole","Mylan","James","Kim","Tom","Bob","Candis","Jan","Pam","Jim",
                        "Mike","Tim","Chris","Candis","Ken","Lakiea","Dolores","Cheryl","Ken"};

                String[] hometown = {"Detroit","Warren","Southfield","Livonia","Atlanta","Detroit","Farmington","Detroit",
                        "Detroit","Ferndale","Dearborn","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit",
                        "Atlanta","Jacksonville","Detroit",};

                String[] food = {"Chicken","Chili","Pizza","Ribs","Shrimp","Fruit","Salad","Hot dog","Chicken",
                        "Pork chops","Rolls","Taco","Burrito","Chicken","Chicken","Chicken","Chicken","Chicken",
                        "Chicken","Chicken","Chicken","Chicken",};

                if (number > 20 || number < 1) {
                    System.out.println("Please try again!");
                }

                System.out.println("What would you like to know about " + student[number - 1]);

                //int index = scan.nextInt();
                System.out.println("City " + hometown[number - 1]);

                System.out.println( "Favorite Food " + food[number - 1]);

                scan.close();


        }
    }


