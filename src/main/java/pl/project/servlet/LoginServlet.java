package pl.project.servlet;



import pl.project.db.ConnectionDbUser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Qbon on 2017-06-23.
 */

public class LoginServlet extends HttpServlet {
    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/pages/login.jsp");
        rd.forward(req, resp);
    }

    public static boolean userLoged;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException{

        String login = req.getParameter("Login");
        String pass = req.getParameter("Password");

        System.out.println("username: " + login);

        ConnectionDbUser con = new ConnectionDbUser();

        if(con.checkUser(login, pass)){
            userLoged = con.checkUser(login, pass);
            System.out.println(userLoged);

            PrintWriter writer = resp.getWriter();
            String htmlRespone = "<html>";
            htmlRespone += "<h2>Hello! " + login + " you are successfully logged in<br/>";
            htmlRespone += "<a href=/hr/sec/main>Start</a>";
            htmlRespone += "</html>";
            writer.println(htmlRespone);

        }
        else{
            PrintWriter writer = resp.getWriter();
            String htmlRespone = "<html>";
            htmlRespone += "<h2>Login or/and password incorect<br/>";
            htmlRespone += "<a href=/hr/sec/main>Try again</a>";
            htmlRespone += "</html>";
            writer.println(htmlRespone);
            userLoged = false;
        }

        System.out.println(userLoged);




    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        processRequest(req,resp);



    }



}
