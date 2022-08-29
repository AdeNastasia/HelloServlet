package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name"); // берем параметр name из запроса
        String surname = req.getParameter("surname"); // берем параметр surname из запроса

        PrintWriter printWriter = resp.getWriter(); // создаем
        printWriter.println("<h1>Hello, " + name + " " + surname + "!" + "<h1>");
        printWriter.close();
    }
}
