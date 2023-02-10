
//Import the required packages
import java.util.*;

//Create a class with Classname as NumberGuessingGame
public class NumberGuessingGame {

    public static void main(String[] args) {

        // Here we have created Scanner obj
        Scanner sc = new Scanner(System.in);

        // Using Math.random() generates the random number, ranging between 0 and 1 or  =0
        int randomNo = 1 + (int) (100 * Math.random());
        // Here we multiply *100 since the Math.random() generates the number between 0  and 1, and we add one to get 1

        int Guessno = 0;

        for (int i = 5; i >= 0; --i) {
            int ChancesLeft = i - 1;

            if (i == 0) {

                System.out.println("\n.......BETTER LUCK NEXT TIME\n .... HOPE YOU ENJOYED PLAYING GAME \n");

            } else {

                System.out.println("Guess the Random number:");

                // Here we will take the input from Keyboard
                Guessno = sc.nextInt();

                if (randomNo == Guessno) {

                    System.out.println("The number you have guessed is Correct.....CONGRATULATIONS!!!!");
                    System.out.println("SCORE: " + i);

                    break;

                } else if (randomNo > Guessno) {

                    System.out.println("The number you have guessed is lesser than random number.......TRY AGAIN....");
                    System.out.println("You have Still " + ChancesLeft + " chances left");

                } else if (randomNo < Guessno) {

                    System.out
                            .println("The number you have guessed is greather than random number.......TRY AGAIN....");
                    System.out.println("You have Still " + ChancesLeft + " chances left");

                }
            }
        }
    }
}
