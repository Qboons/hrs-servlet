package pl.project.servlet;

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
public class EmployeesUpServlet extends HttpServlet {
    private void processRequest(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/pages/empUp.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        int emp_id = Integer.parseInt(req.getParameter("Emp_Id"));
        String fName = req.getParameter("Fname");
        String lName = req.getParameter("Lname");
        int age = Integer.parseInt(req.getParameter("Age"));
        double salary = Double.parseDouble(req.getParameter("Salary"));
        String sex = req.getParameter("Sex");
        int job_id =Integer.parseInt(req.getParameter("Job_Id"));
        int dep_id =Integer.parseInt(req.getParameter("Dep_Id"));



        System.out.println("name: " + fName);



        PrintWriter writer = resp.getWriter();


        String htmlRespone = "<html>";
        htmlRespone += "<h2>Updated: " + emp_id +" name "+fName+ "<br/>";
        htmlRespone += "<a href=/hr/sec/emp>Return</a>";
        htmlRespone += "</html>";


        writer.println(htmlRespone);

        ConnectionDbEmployee con = new ConnectionDbEmployee();
        con.updateEmp(emp_id,fName,lName,age,salary,sex,job_id,dep_id);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        processRequest(req,resp);
    }
}
