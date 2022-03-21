package by.tms.web.servlet;

import by.tms.entity.Operation;
import by.tms.entity.User;
import by.tms.service.CalcService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/calc", name = "CalcServlet")
public class CalcServlet extends HttpServlet {

    private final CalcService calcService = new CalcService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        String operand = req.getParameter("operand");

        User user = (User) req.getSession().getAttribute("user");
        Operation calc = calcService.calc(num1, num2, operand, user);
        resp.getWriter().print(calc);
    }
}
