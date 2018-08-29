package pl.project.servlet;

import pl.project.db.ConnectionDbJob;
import pl.project.db.ConnectionDbProject;

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
public class ProjectDelServlet extends HttpServlet {
    private void processRequest(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/pages/proDel.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int project_id =Integer.parseInt(req.getParameter("Project_Id"));


        System.out.println("ID: " + project_id);

        PrintWriter writer = resp.getWriter();


        String htmlRespone = "<html>";
        htmlRespone += "<h2>Deleted project: " + project_id + "<br/>";
        htmlRespone += "<a href=/hr/sec/pro>Return</a>";
        htmlRespone += "</html>";


        writer.println(htmlRespone);

        ConnectionDbProject con = new ConnectionDbProject();


        con.deleteProject(project_id);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

}
