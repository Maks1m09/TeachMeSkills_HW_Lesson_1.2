package by.tms.web.servlet;

import by.tms.entity.User;
import by.tms.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User user = userService.findUserByLogin(login);
         if (user==null){
             System.out.println("User does not exist");
         }
        else if (user.getPassword().equals(password)) {
            req.getSession().setAttribute("user", user);
        } else {
            resp.getWriter().println("Wrong Password!");
        }
    }
}
