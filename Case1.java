//Case 1:Guess 1-100 number
import java.util.Random;
import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        //int count = 0;
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Please enter the number you want to guess");
            int guessNumber = sc.nextInt();
            /*count++;
            if (count == 4){
                System.out.println("Bingo!");
                break;
            } Try four times will also win*/

            if (guessNumber > number){
                System.out.println("Too big");
            }else if (guessNumber < number){
                System.out.println("too small");
            }else {
                System.out.println("Bingo!");
                break;
            }
        }

    }
}
