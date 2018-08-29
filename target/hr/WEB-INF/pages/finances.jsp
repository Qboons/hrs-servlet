<%@ page contentType="text/html" %>
<%@ page import="java.sql.*" %>
<%@ page import="org.sqlite.*" %>


<!DOCTYPE html>
<html>
    <head>
        <title>HRJobs</title>
        <link rel="stylesheet" href="../css/style.css" />

    </head>

     <body>
        <div id="container">

         <div id="bar">
                                  <h1>Finances</h1>
                                  <div class="naviMain2">
                  					<a href="/hr/sec/dep">
                  						<img src="../include/dep.png" width="30" height="30" alt="Departments" title="Departments">
                  					</a>
                  				</div>
                                  <div class="naviMain2">
                  					<a href="/hr/sec/emp">
                  						<img src="../include/emp.png" width="30" height="30" alt="Employees" title="Employees">
                  					</a>
                  				</div>
                                  <div class="naviMain2">
                  					<a href="/hr/sec/fin">
                  						<img src="../include/fin.png" width="30" height="30" alt="Finances" title="Finances">
                  					</a>
                  				</div>
                                  <div class="naviMain2">
                  					<a href="/hr/sec/job">
                  						<img src="../include/job.png" width="30" height="30" alt="Jobs" title="Jobs">
                  					</a>
                  				</div>
                                  <div class="naviMain2">
                  					<a href="/hr/sec/pro">
                  						<img src="../include/pro.png" width="30" height="30" alt="Projects" title="Projects">
                  					</a>
                  				</div>
                                  <div class="naviMain2">
                  					<a href="/hr/sec/tra">
                  						<img src="../include/tra.png" width="30" height="30" alt="Trainings" title="Trainings">
                  					</a>
                  				</div>
                  			</div>
           <div id="middle">

                            <div class="box">
                                  <table id="tabela">
                                      <thead>
                                          <tr>
                                              <th>Salary sum</th>

                                          </tr>
                                      </thead>
                                      <tbody>
                                      <%
                                          Class.forName("org.sqlite.JDBC");
                                          Connection conn =
                                               DriverManager.getConnection("jdbc:sqlite:info2.db");
                                          Statement stat = conn.createStatement();

                                          ResultSet rs = stat.executeQuery("select sum(Salary) as Sum from Employees;");

                                          while (rs.next()) {
                                              out.println("<tr>");
                                              out.println("<td>" + rs.getString("Sum") + "</td>");

                                              out.println("</tr>");
                                          }

                                          rs.close();
                                          conn.close();
                                      %>
                                      </tbody>
                                  </table>

                            </div>
 <div class="box">
                                  <table id="tabela">
                                      <thead>
                                          <tr>
                                              <th>Department</th>
                                              <th>Salary sum</th>

                                          </tr>
                                      </thead>
                                      <tbody>
                                      <%
                                          Class.forName("org.sqlite.JDBC");
                                          Connection conn2 =
                                               DriverManager.getConnection("jdbc:sqlite:info2.db");
                                          Statement stat2 = conn2.createStatement();

                                          ResultSet rs2 = stat2.executeQuery("select D.DepName,sum(E.Salary) as Sum from Employees E, Departments D where"
                                           +" D.Dep_Id=E.Dep_Id group by DepName;");

                                          while (rs2.next()) {
                                              out.println("<tr>");
                                              out.println("<td>" + rs2.getString("DepName") + "</td>");
                                              out.println("<td>" + rs2.getString("Sum") + "</td>");

                                              out.println("</tr>");
                                          }

                                          rs2.close();
                                          conn2.close();
                                      %>
                                      </tbody>
                                  </table>

                            </div>
<div class="box">
                                  <table id="tabela">
                                      <thead>
                                          <tr>


                                              <th>Department</th>
                                              <th>Avarage salary</th>

                                          </tr>
                                      </thead>
                                      <tbody>
                                      <%
                                          Class.forName("org.sqlite.JDBC");
                                          Connection conn3 =
                                               DriverManager.getConnection("jdbc:sqlite:info2.db");
                                          Statement stat3 = conn3.createStatement();

                                          ResultSet rs3 = stat3.executeQuery("select D.DepName,avg(E.Salary) as Avg from Employees E, Departments D where"
                                            +" D.Dep_Id=E.Dep_Id group by DepName;");

                                          while (rs3.next()) {
                                              out.println("<tr>");

                                              out.println("<td>" + rs3.getString("DepName") + "</td>");
                                              out.println("<td>" + rs3.getString("Avg") + "</td>");

                                              out.println("</tr>");
                                          }

                                          rs2.close();
                                          conn2.close();
                                      %>
                                      </tbody>
                                  </table>

                            </div>





           </div>
        </div>

    </body>



</html>