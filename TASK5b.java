package Tasks01_07;

import java.util.Random;
import java.util.regex.*;


/**
 * Created by alena on 19.09.15.
 */
public class TASK5b {
    public static void main(String[] args) {
        int truenumbers = 0;
        int truenumbers1 = 0;
        int allnumbers = 0;
        Random random = new Random();
        while(truenumbers1 != 10){
            int num = random.nextInt();
            num = Math.abs(num);
            //Pattern p = Pattern.compile("(([0-9]*)(([13579]+)[02468]{2}([13579]+))){2,}");
            Pattern p1 = Pattern.compile("([02468]{2}([13579]+)){2}");
            String str = Integer.toString(num);
            //Matcher m = p.matcher(str);
            Matcher m1 = p1.matcher(str);
            if(m1.matches()){
                System.out.println(num);
                truenumbers++;
            }
            if(m1.find()){
                //System.out.println(num);
                truenumbers1++;
            }
            allnumbers++;
        }
        System.out.println("Общее количество сгенерированных чисел: " + allnumbers);

    }
}
