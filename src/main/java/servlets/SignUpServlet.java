package servlets;

import accounts.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpServlet extends HttpServlet {

    private final AccountService accountService;

    public SignUpServlet(AccountService accountService) {
        this.accountService = accountService;
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String name = request.getParameter("name");

        if (!login.isEmpty() && !password.isEmpty() && !name.isEmpty()){
            accountService.addNewUser(login, password, name);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().print("Now you can authorize.");
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().print("Please, try again.");
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
        }

    }

}
