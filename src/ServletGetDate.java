import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by alena on 01.10.15.
 */
@WebServlet(name = "ServletGetDate")
public class ServletGetDate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        response.getWriter().print("<html> <body>" + formatter.format(new Date()) + "</body><html>");
        response.getWriter().close();
    }
}
