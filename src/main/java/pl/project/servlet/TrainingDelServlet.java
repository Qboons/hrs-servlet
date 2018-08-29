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
public class TrainingDelServlet extends HttpServlet {
    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/pages/traDel.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int training_id =Integer.parseInt(req.getParameter("Training_Id"));


        System.out.println("ID: " + training_id);

        PrintWriter writer = resp.getWriter();


        String htmlRespone = "<html>";
        htmlRespone += "<h2>Deleted training: " + training_id + "<br/>";
        htmlRespone += "<a href=/hr/sec/tra>Return</a>";
        htmlRespone += "</html>";


        writer.println(htmlRespone);

        ConnectionDbTraining con = new ConnectionDbTraining();


        con.deleteTraining(training_id);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
