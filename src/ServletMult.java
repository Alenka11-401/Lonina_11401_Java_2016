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
@WebServlet(name = "ServletMult")
public class ServletMult extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Pattern pattern = Pattern.compile("/(mult)/(\\d)/(\\d)/?");
        Matcher matcher = pattern.matcher(request.getRequestURI());

        if (matcher.matches()) {
            response.getWriter().print(Integer.parseInt(matcher.group(2)) * Integer.parseInt(matcher.group(3)));

        } else {
            response.sendRedirect("/error404");
        }
    }
}
