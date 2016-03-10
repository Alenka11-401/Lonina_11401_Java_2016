package Tasks01_07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alena on 20.09.15.
 */
public class TASK7b {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        FileReader file = new FileReader("file.html");
        while (scanner.hasNextLine()) {
            String stroka = scanner.nextLine();
            Pattern p = Pattern.compile("(https?://)?(www\\.)?(((/([\\w-]+))+)*/(([\\w-]+)\\.([\\w]+)))");
            Matcher m = p.matcher(stroka);
            while (m.find()) {
                System.out.println("FILENAME: " + m.group(3));
            }
        }
    }
}
