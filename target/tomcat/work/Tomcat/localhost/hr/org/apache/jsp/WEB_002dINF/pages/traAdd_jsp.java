/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-08-29 09:37:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class traAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
ResultSet resultset =null;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>HRTrainings</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/style.css\" />\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("\r\n");
      out.write("         <div id=\"bar\">\r\n");
      out.write("                        <h1>New Training</h1>\r\n");
      out.write("<div class=\"naviMain2\">\r\n");
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
      out.write("        \t\t\t</div>\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("\t\t\t<form name=\"addingForm\" method=\"post\" action=\"traadd\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Name:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"TrainingName\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Start Date:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"StartDate\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("\t\t\t\t\t\t<td>End Date </td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"EndDate\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("\r\n");
      out.write("                    <td>Job:</td>\r\n");
      out.write("                    ");

                     try{
                     //Class.forName("org.sqlite.JDBC").newInstance();
                     Connection connection =
                      DriverManager.getConnection
                                 ("jdbc:sqlite:info2.db");

                    Statement statement = connection.createStatement() ;
                    resultset =statement.executeQuery("select * from Jobs") ;
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t <td>\r\n");
      out.write("                    <select name=\"Job_Id\">\r\n");
      out.write("                   ");
  while(resultset.next()){ 
      out.write("\r\n");
      out.write("                       <option value='");
      out.print( resultset.getString("Job_Id"));
      out.write("'>\r\n");
      out.write("                       ");
      out.print( resultset.getString("Job_Id"));
      out.write("\r\n");
      out.write("                       ;");
      out.print( resultset.getString("JobName"));
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                       ");

                          //**Should I input the codes here?**
                      }
                        catch(Exception e)
                          {
                            out.println("wrong entry"+e);
                          }
                          
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("\t\t\t\t\t<td>Department:</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("                  ");

                     try{
                     //Class.forName("org.sqlite.JDBC").newInstance();
                     Connection connection =
                      DriverManager.getConnection
                                 ("jdbc:sqlite:info2.db");

                    Statement statement = connection.createStatement() ;
                    resultset =statement.executeQuery("select * from Departments") ;
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <select name=\"Dep_Id\">\r\n");
      out.write("                   ");
  while(resultset.next()){ 
      out.write("\r\n");
      out.write("                       <option value='");
      out.print( resultset.getString("Dep_Id"));
      out.write('\'');
      out.write('>');
      out.print( resultset.getString("Dep_Id"));
      out.write(';');
      out.print( resultset.getString("DepName"));
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                       ");

                          //**Should I input the codes here?**
                      }
                        catch(Exception e)
                          {
                            out.println("wrong entry"+e);
                          }
                          
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t        <td><input type=\"submit\" value=\"Submit\" /></td>\r\n");
      out.write("\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    </body>\r\n");
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
