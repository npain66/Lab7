public class Main {

    public static void main(String[] args) {


        //initial numbers
        int number = 19676;
        int reversedNumber = 0;
        int num = 0;

        while(number > 0){

            //using modulus for configuration
            num = number%10;

            //implementing reversed numbers
            reversedNumber = reversedNumber * 10 + num;
            number = number/10;

        }

        //output
        System.out.println("Reversed Number is:" + reversedNumber);
    }
}
