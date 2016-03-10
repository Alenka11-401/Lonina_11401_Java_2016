package Tasks01_07;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alena on 20.09.15.
 */
public class TASK7c {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        FileReader file = new FileReader("file.html");
        while (scanner.hasNextLine()) {
            String stroka = scanner.nextLine();
            Pattern p = Pattern.compile("(https?://)?(www\\.)?(((/([\\w-]+))+)*/([\\w-]+))\\?([\\w\\s\\-\\(\\)&%=/:\\.,;'+]+)");
            Pattern p1 = Pattern.compile("(([\\w\\.#%]+)=([\\w#%:\\.]+))+");
            Matcher m = p.matcher(stroka);


            while (m.find()) {
                System.out.println("PARAM STRING:"+ m.group(8));
                Matcher m1 = p1.matcher(m.group(8));
                while(m1.find()){
                System.out.println("NAME: " + m1.group(2));
                System.out.println("VALUE: " + m1.group(3));
                }
            }
        }
    }
}
