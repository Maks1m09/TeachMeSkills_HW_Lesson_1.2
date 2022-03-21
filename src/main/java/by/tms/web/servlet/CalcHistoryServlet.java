package by.tms.web.servlet;

import by.tms.entity.Operation;
import by.tms.service.CalcService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/history", name = "CalcHistoryServlet")
public class CalcHistoryServlet extends HttpServlet {
    private final CalcService calcService = new CalcService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Operation> all = calcService.findAll();
        for (Operation operation : all) {
            resp.getWriter().println(operation);
        }

    }
}