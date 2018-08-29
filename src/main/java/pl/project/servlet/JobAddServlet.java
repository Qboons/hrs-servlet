package pl.project.servlet;

import pl.project.db.ConnectionDbEmployee;
import pl.project.db.ConnectionDbJob;

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
public class JobAddServlet extends HttpServlet {
    private void processRequest(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/pages/jobAdd.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String jobName = req.getParameter("jobName");
        double maxSalary = Double.parseDouble(req.getParameter("maxSalary"));
        double minSalary = Double.parseDouble(req.getParameter("minSalary"));
        int dep_id =Integer.parseInt(req.getParameter("Dep_Id"));



        System.out.println("name: " + jobName);



        PrintWriter writer = resp.getWriter();


        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your job name is: " + jobName + "<br/>";
        htmlRespone += "<a href=/hr/sec/job>Return</a>";
        htmlRespone += "</html>";


        writer.println(htmlRespone);

        ConnectionDbJob con = new ConnectionDbJob();
        con.addJob(jobName,maxSalary,minSalary,dep_id);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }
}
