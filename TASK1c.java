package Tasks01_07;
import java.util.regex.*;

/**
 * Created by alena on 16.09.15.
 */
public class TASK1c {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(03\\.(0[6-9]|[12][0-9]|3[01])\\.1237\\ (1[2-9]|2[0-3])\\:[0-5][0-9])" +
                "|((0[4-9]|1[0-2])\\.(0[1-9]|[012][0-9]|3[01])\\.1237\\ ([01][0-9]|2[0-3])\\:[0-5][0-9]) " +
                "|((0[0-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.123[89]\\ ([01][0-9]|2[0-3])\\:[0-5][0-9])|" +
                "((0[0-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.12[4-9][0-9]\\ ([01][0-9]|2[0-3])\\:[0-5][0-9])" +
                "|((0[0-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.1[3-8][0-9][0-9]\\ ([01][0-9]|2[0-3])\\:[0-5][0-9])" +
                "|((0[0-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.19[0-6][0-9]\\ ([01][0-9]|2[0-3])\\:[0-5][0-9])" +
                "|((0[0-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.197[0-7]\\ ([01][0-9]|2[0-3])\\:[0-5][0-9])" +
                "|(0[12]\\.(0[1-9]|[12][0-6])\\.1978\\ ([01][0-9]|2[0-3])\\:[0-5][0-9])" +
                "|(02\\.27\\.1978\\ (([01][0-9]|20\\:[0-5][0-9])|(21\\:([012][0-9]|3[0-5]))))");
        Matcher m = p.matcher("12.09.1966 09:30");
        boolean b = m.matches();
        System.out.println(b);
    }
}