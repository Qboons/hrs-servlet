package pl.project.servlet;

import pl.project.db.ConnectionDbDepratment;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Qbon on 2017-06-23.
 */
public class DepartmentUpServlet extends HttpServlet {
    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/pages/depUp.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String depName = req.getParameter("DepName");
        int dep_Id = Integer.parseInt(req.getParameter("Dep_Id"));



        System.out.println("dep name: " + depName);



        PrintWriter writer = resp.getWriter();


        String htmlRespone = "<html>";
        htmlRespone += "<h2>Updated department : " + dep_Id +"to name"+depName+ "<br/>";
        htmlRespone += "<a href=/hr/sec/dep>Return</a>";
        htmlRespone += "</html>";


        writer.println(htmlRespone);

        ConnectionDbDepratment con = new ConnectionDbDepratment();

        con.updateDep(dep_Id,depName);
        con.selectDep();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        processRequest(req,resp);
    }


}
