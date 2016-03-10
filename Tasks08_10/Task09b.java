package Tasks08_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alena on 24.09.15.
 */
public class Task09b {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy hh:mm");

        while(true){
            File file = new File("/home/alena/git/Homework2k1s/src/Tasks08_10/" + formatter.format(new Date()) + ".html");
            PrintWriter printWriter = new PrintWriter(file);
            String request = scanner.nextLine();
            if(request.equals("/exit")){
                file.delete();
                break;
            }

            if(request.equals("/getdate")){
                printWriter.print("<html> <body>" + formatter.format(new Date())+ "</body><html>");
                printWriter.close();
                continue;
            }

            Pattern pattern = Pattern.compile("(add|mult)/(\\d)/(\\d)");
            Matcher  matcher = pattern.matcher(request);

            if (matcher.matches()){
                if(matcher.group(1).equals("add")){
                    printWriter.print(Integer.parseInt(matcher.group(2)) + Integer.parseInt(matcher.group(3)));
                }
                else {
                    printWriter.print(Integer.parseInt(matcher.group(2)) * Integer.parseInt(matcher.group(3)));
                }
            }

            Pattern pattern1 = Pattern.compile("(baidu|bing|yahoo|aol)\\.com/search");
            Matcher matcher1 = pattern1.matcher(request);

            if(matcher.matches()){
                printWriter.print("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head lang=\"en\">\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "</head>\n" +
                        "<body>\n");
                if(matcher1.group(1).equals("baidu")){
                    printWriter.print("<form action=\"http://www.baidu.com/\" method=\"GET\">");
                } else if( matcher1.group(1).equals("bing")){
                    printWriter.print("<form action=\"http://www.bing.com/\" method=\"GET\">");
                } else if( matcher1.group(1).equals("aol")){
                    printWriter.print("<form action=\"http://www.aol.com/\" method=\"GET\">");
                } else if( matcher1.group(1).equals("yahoo")){
                    printWriter.print("<form action=\"http://www.yahoo.com/\" method=\"GET\">");
                }
                printWriter.print("\n<input type=\"text\" name=\"q\"");
                printWriter.print("<input type=\"submit\" value=\"Поиск на "
                        + matcher1.group(1)
                        + "\"/>\n" + "</form>\n" + "</body>\n" +
                        "</html>");
                printWriter.close();
            } else{
                printWriter.print("404/NotFound");
                printWriter.close();
            }
        }

    }
}
