package Tasks01_07;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alena on 19.09.15.
 */
public class TASK3b {
    public static void main(String[] args) {
        int truenumbers = 0;
        int truenumbers1 = 0;
        int allnumbers = 0;
        Random random = new Random();
        while(truenumbers != 10){
            int num = random.nextInt();
            num = Math.abs(num);
            Pattern p = Pattern.compile("[0-9]*[02468]{3,}[0-9]*");
            Pattern p1 = Pattern.compile("[02468]{3,}");
            String str = Integer.toString(num);
            Matcher m = p.matcher(str);
            Matcher m1 = p1.matcher(str);
            if(!m.matches()){
                System.out.println(num);
                truenumbers++;
            }
            if(!m1.find()){
                System.out.println(num);
                truenumbers1++;
            }
            allnumbers++;
        }
        System.out.println("Общее количество сгенерированных чисел: " + allnumbers);
    }
}
