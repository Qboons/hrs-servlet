package pl.project.servlet;

import pl.project.db.ConnectionDbDepratment;
import pl.project.db.ConnectionDbEmployee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Qbon on 2017-06-24.
 */
public class EmployeesDelServlet extends HttpServlet {
    private void processRequest(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/pages/empDel.jsp");
        rd.forward(req,resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int emp_id =Integer.parseInt(req.getParameter("Emp_Id"));


        System.out.println("Emp: " + emp_id);

        PrintWriter writer = resp.getWriter();


        String htmlRespone = "<html>";
        htmlRespone += "<h2>Deleted employee: " + emp_id + "<br/>";
        htmlRespone += "<a href=/hr/sec/emp>Return</a>";
        htmlRespone += "</html>";


        writer.println(htmlRespone);

        ConnectionDbEmployee con = new ConnectionDbEmployee();


        con.deleteEmp(emp_id);



    }
}
