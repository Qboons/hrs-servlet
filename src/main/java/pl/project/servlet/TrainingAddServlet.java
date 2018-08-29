package pl.project.servlet;

import pl.project.db.ConnectionDbJob;
import pl.project.db.ConnectionDbTraining;

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
public class TrainingAddServlet extends HttpServlet {
    private void processRequest(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/pages/traAdd.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String trainingName = req.getParameter("TrainingName");
        String startDate = req.getParameter("StartDate");
        String endDate = req.getParameter("EndDate");
        int job_id =Integer.parseInt(req.getParameter("Job_Id"));
        int dep_id =Integer.parseInt(req.getParameter("Dep_Id"));



        System.out.println("name: " + trainingName);



        PrintWriter writer = resp.getWriter();


        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your training name is: " + trainingName + "<br/>";
        htmlRespone += "<a href=/hr/sec/tra>Return</a>";

        htmlRespone += "</html>";


        writer.println(htmlRespone);
        ConnectionDbTraining con = new ConnectionDbTraining();
        con.addTraining(trainingName,startDate,endDate,job_id,dep_id);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }
}

