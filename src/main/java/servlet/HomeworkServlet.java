package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/infoShareAcademy")
public class HomeworkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LocalDateTime actualTime = LocalDateTime.now();
        resp.getWriter().println("<!DOCTYPE html>\n" + "<html lang=\"en\">\n" + "<head>\n" + "    <meta charset=\"UTF-8\">\n" + "    <title>infoShareAcademy</title>\n" + "</head>\n" + "<body>");
        resp.getWriter().println("<p>Lukasz Ratajczak</p>");
        resp.getWriter().println("<p>jjdd6-codeina</p>");
        resp.getWriter().println("<p>" +actualTime + "</p>");
        resp.getWriter().println("</body>\n" + "</html>");
    }
}
