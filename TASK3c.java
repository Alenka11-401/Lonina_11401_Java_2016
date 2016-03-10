package Tasks01_07;
import java.util.Random;
import java.util.regex.*;


/**
 * Created by alena on 19.09.15.
 */
public class TASK3c {
    public static void main(String[] args) {
        int truenumbers = 0;
        int allnumbers = 0;
        Random random = new Random();
        while(truenumbers != 10){
            int num = random.nextInt();
            num = Math.abs(num);
            Pattern p = Pattern.compile("[0-9]*(0|2|4|6|8)$");
            String str = Integer.toString(num);
            Matcher m = p.matcher(str);
            if(m.matches()){
                System.out.println(num);
                truenumbers++;
            }
            allnumbers++;
        }
        System.out.println("Общее количество сгенерированных чисел: " + allnumbers);
    }
}
