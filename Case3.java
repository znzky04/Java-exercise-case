//Case 3 :Six judges score
import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }

        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);
        int svg = (sum - max -min)/(scoreArr.length-2);
        System.out.println("Total score is " + sum +
                "And the average score is " + svg +" That is the final score.");
    }

    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min){
                min = scoreArr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum +scoreArr[i];
        }
        return sum;
    }

    public static int[] getScores(){
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("Please enter the judges' scores.");
            int score = sc.nextInt();
            if(score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            }else {
                System.out.println("The score does not meet the standard. Please enter a number between 0 and 100," +
                        " current score for the " + i+1 +"judge.");
            }
        }
        return scores;
    }



}
