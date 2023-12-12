import java.util.Random;
import java.util.Scanner;
public class game{
    public static void main(String[] args){
        int lowerbound = 1;
        int upperbound = 100;
        int no_of_guesses = 0;
        Random newnum = new Random();
        int actualnum = newnum.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game!!");


        while (true) {
            System.out.println("Guess a number between 1 to 100 :");
            int userguess = sc.nextInt();
            no_of_guesses++;

            if (userguess == actualnum) {
                System.out.println("Congratulations!!, you guessed the right number : "+actualnum);
                break;
            }
            else if (userguess<lowerbound || userguess > upperbound) {
                System.out.println("Enter a number between 1 to 100 :");
            }
            else if (userguess<actualnum) {
                System.out.println("Too Low try again !");
            }
            else{
                System.out.println("Too high please try again !");
            }
        }
    }
}