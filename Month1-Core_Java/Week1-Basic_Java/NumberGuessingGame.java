import java.util.*;

public class NumberGuessingGame {
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        Random rand=new Random();

        int numberToGuess = rand.nextInt(100)+1;

        System.out.println("Welcome to the Number Guessing Game:");
        System.out.println("I Guess the number between 1 to 100");
       int attempt =0;
        int guess =0;

        do{
             System.out.println("Tell me your Guess:");

            guess=sc.nextInt();
            attempt++;
            if (guess > numberToGuess)
            {

                System.out.println("Your Guess is too Big:");
            }

            else if (guess < numberToGuess)
            {

                System.out.println("Your Guess is too Small:");
            }
            else{

                System.out.println("Congratulation your guess is right");


            }
        }while( guess !=numberToGuess );
        System.out.println("you guess the number in "+ attempt);
    }
}
