package servlets;

import beans.CartBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BaseServlet", urlPatterns = {"/welcome"})
public class BaseServlet extends HttpServlet {

    @EJB
    CartBean cartBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        resp.setContentType("text/json");
        resp.getWriter().write(String.valueOf(cartBean.getItems()));
    }
}
