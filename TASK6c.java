package Tasks01_07;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.*;
import java.util.Scanner;

/**
 * Created by alena on 19.09.15.
 */
public class TASK6c {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        FileReader file = new FileReader("file.html");
        while (scanner.hasNextLine()) {
            String stroka = scanner.nextLine();
            Pattern p = Pattern.compile("(https?://)?(www\\.)?(((/([A-z0-9-]+))+)*/([A-z0-9-]+)\\.([A-z0-9]+))\\\\");
            Matcher m = p.matcher(stroka);
            while (m.find()) {
                System.out.println("FILENAME: " + m.group(7));
                System.out.println("EXTENSION: " + m.group(8));
            }
        }
    }
}
