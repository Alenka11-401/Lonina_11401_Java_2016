package Tasks01_07;
import java.util.ArrayList;
import java.util.Scanner;
import  java.util.regex.*;

/**
 * Created by alena on 17.09.15.
 */
public class TASK2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер массива");
        int n = scanner.nextInt();
        Scanner line = new Scanner(System.in);
        String [] mas = new String[n];
        int j = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            System.out.println("Введи строку");
            mas[i] = line.nextLine();
            Pattern p = Pattern.compile("(((01)+)0?)|(0+)|(1+)|(((10)+)(1?))");
            Matcher m = p.matcher(mas[i]);
            boolean b = m.matches();
            if(b){
                numbers.add(i+1);
                j++;
            }

        }


        System.out.print("Строки: ");
        for(int i = 0; i < j; i++){
            System.out.print(numbers.get(i) + "; ");
        }
    }
}
/**/