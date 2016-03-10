package Tasks01_07;

import java.util.regex.*;


/**
 * Created by alena on 17.09.15.
 */
public class TASK1a {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(\\-?([1-9][0-9]*)(\\,[0-9]*[1-9]|[0-9]*\\([0-9]+\\))?)|0");
        Matcher m = p.matcher("0,064");
        boolean b = m.matches();
        System.out.println(b);
    }
}
