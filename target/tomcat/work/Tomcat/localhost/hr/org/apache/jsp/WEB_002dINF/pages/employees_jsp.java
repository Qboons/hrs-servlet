/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-08-29 09:37:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import org.sqlite.*;

public final class employees_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>HREmployees</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/style.css\" />\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("     <body>\r\n");
      out.write("        <div id=\"container\">\r\n");
      out.write("\r\n");
      out.write("              <div id=\"bar\">\r\n");
      out.write("                             <h1>Employees</h1>\r\n");
      out.write("                             <div class=\"naviMain2\">\r\n");
      out.write("             \t\t\t\t\t<a href=\"/hr/sec/dep\">\r\n");
      out.write("             \t\t\t\t\t\t<img src=\"../include/dep.png\" width=\"30\" height=\"30\" alt=\"Departments\" title=\"Departments\">\r\n");
      out.write("             \t\t\t\t\t</a>\r\n");
      out.write("             \t\t\t\t</div>\r\n");
      out.write("                             <div class=\"naviMain2\">\r\n");
      out.write("             \t\t\t\t\t<a href=\"/hr/sec/emp\">\r\n");
      out.write("             \t\t\t\t\t\t<img src=\"../include/emp.png\" width=\"30\" height=\"30\" alt=\"Employees\" title=\"Employees\">\r\n");
      out.write("             \t\t\t\t\t</a>\r\n");
      out.write("             \t\t\t\t</div>\r\n");
      out.write("                             <div class=\"naviMain2\">\r\n");
      out.write("             \t\t\t\t\t<a href=\"/hr/sec/fin\">\r\n");
      out.write("             \t\t\t\t\t\t<img src=\"../include/fin.png\" width=\"30\" height=\"30\" alt=\"Finances\" title=\"Finances\">\r\n");
      out.write("             \t\t\t\t\t</a>\r\n");
      out.write("             \t\t\t\t</div>\r\n");
      out.write("                             <div class=\"naviMain2\">\r\n");
      out.write("             \t\t\t\t\t<a href=\"/hr/sec/job\">\r\n");
      out.write("             \t\t\t\t\t\t<img src=\"../include/job.png\" width=\"30\" height=\"30\" alt=\"Jobs\" title=\"Jobs\">\r\n");
      out.write("             \t\t\t\t\t</a>\r\n");
      out.write("             \t\t\t\t</div>\r\n");
      out.write("                             <div class=\"naviMain2\">\r\n");
      out.write("             \t\t\t\t\t<a href=\"/hr/sec/pro\">\r\n");
      out.write("             \t\t\t\t\t\t<img src=\"../include/pro.png\" width=\"30\" height=\"30\" alt=\"Projects\" title=\"Projects\">\r\n");
      out.write("             \t\t\t\t\t</a>\r\n");
      out.write("             \t\t\t\t</div>\r\n");
      out.write("                             <div class=\"naviMain2\">\r\n");
      out.write("             \t\t\t\t\t<a href=\"/hr/sec/tra\">\r\n");
      out.write("             \t\t\t\t\t\t<img src=\"../include/tra.png\" width=\"30\" height=\"30\" alt=\"Trainings\" title=\"Trainings\">\r\n");
      out.write("             \t\t\t\t\t</a>\r\n");
      out.write("             \t\t\t\t</div>\r\n");
      out.write("             \t\t\t</div>\r\n");
      out.write("           <div id=\"middle\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"box\">\r\n");
      out.write("                                  <table id=\"tabela\">\r\n");
      out.write("                                      <thead>\r\n");
      out.write("                                          <tr>\r\n");
      out.write("                                              <th>Emp_Id</th>\r\n");
      out.write("                                              <th>FName</th>\r\n");
      out.write("                                              <th>LName</th>\r\n");
      out.write("                                              <th>Age</th>\r\n");
      out.write("                                              <th>Salary</th>\r\n");
      out.write("                                              <th>Sex</th>\r\n");
      out.write("                                              <th>Job_Id</th>\r\n");
      out.write("                                              <th>Dep_Id</th>\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                      </thead>\r\n");
      out.write("                                      <tbody>\r\n");
      out.write("                                      ");

                                          Class.forName("org.sqlite.JDBC");
                                          Connection conn =
                                               DriverManager.getConnection("jdbc:sqlite:info2.db");
                                          Statement stat = conn.createStatement();

                                          ResultSet rs = stat.executeQuery("select * from Employees;");

                                          while (rs.next()) {
                                              out.println("<tr>");
                                              out.println("<td>" + rs.getString("Emp_Id") + "</td>");
                                              out.println("<td>" + rs.getString("FirstName") + "</td>");
                                              out.println("<td>" + rs.getString("LastName") + "</td>");
                                              out.println("<td>" + rs.getString("Age") + "</td>");
                                              out.println("<td>" + rs.getString("Salary") + "</td>");
                                              out.println("<td>" + rs.getString("Sex") + "</td>");
                                              out.println("<td>" + rs.getString("Job_Id") + "</td>");
                                              out.println("<td>" + rs.getString("Dep_Id") + "</td>");
                                              out.println("</tr>");
                                          }

                                          rs.close();
                                          conn.close();
                                      
      out.write("\r\n");
      out.write("                                      </tbody>\r\n");
      out.write("                                  </table>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"box2\">\r\n");
      out.write("                                  <a href=/hr/sec/empadd> <button type=\"button\">Add</button></a><br/>\r\n");
      out.write("                                  <a href=/hr/sec/empdel> <button type=\"button\">Delete</button></a><br/>\r\n");
      out.write("                                  <a href=/hr/sec/empup>  <button type=\"button\">Update</button></a><br/>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("           </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
