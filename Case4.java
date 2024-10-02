//Case 4:Random verification code
import java.util.Random;

public class Case4 {
    public static void main(String[] args) {

        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //Lowercase
            if (i <= 25){
                chs[i] = (char) (97 + i);
            }//Uppercase
            else {
                chs[i] = (char) (65 + i -26);
            }
        }

        String result = "";

        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }
        int number = r.nextInt(10);
        result = result + number;

        System.out.println(result);
    }
}
