//Case2:Array summation and statistics
import java.util.Random;

public class Case2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
        System.out.println("The sum of all the data in the array is:" + sum);

        int avg = sum / arr.length;
        System.out.println("The average of all the data in the array is" + avg );

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< avg){
                count++;
            }
        }
        System.out.println("In this array,have" + count + "data less than the average number.");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
