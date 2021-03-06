import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alena on 01.10.15.
 */
@WebServlet(name = "ServletSearch")
public class ServletSearch extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Pattern pattern = Pattern.compile("/search/(baidu|bing|yahoo|aol)/?");
        Matcher matcher = pattern.matcher(request.getRequestURI());

        if(matcher.matches()){
            response.getWriter().print("<!DOCTYPE html>\n" +
                    "<html>\n"+            
                    
                    "<body>\n");
            if(request.getPathInfo().equals("/baidu")){
                response.getWriter().print("<form action=\"http://www.baidu.com/s?ie=utf-8&wd=\" method=\"GET\">");
            } else if( request.getPathInfo().equals("/bing")){
                response.getWriter().print("<form action=\"http://www.bing.com/search?q=f\" method=\"GET\">");
            } else if( request.getPathInfo().equals("/aol")){
                response.getWriter().print("<form action=\"http://www.aol.com/search?q=\" method=\"GET\">");
            } else if( request.getPathInfo().equals("/yahoo")){
                response.getWriter().print("<form action=\"http://www.yahoo.com/search?p=\" method=\"GET\">");
            }
            response.getWriter().print("\n<input type=\"text\" name=\"q\""+">");
            response.getWriter().print("<input type=\"submit\" value=\"Search by"
                    + request.getPathInfo()
                    + "\"/>\n" + "</form>\n" + "</body>\n" +
                    "</html>");
            response.getWriter().close();
        }

    }
}
