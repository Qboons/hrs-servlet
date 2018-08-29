<%@ page contentType="text/html" %>
<%@ page import="java.sql.*" %>
<%@ page import="org.sqlite.*" %>


<!DOCTYPE html>
<html>
    <head>
        <title>HRDepratment</title>
        <link rel="stylesheet" href="../css/style.css" />

    </head>

     <body>
        <div id="container">

             <div id="bar">
                             <h1>Departments</h1>
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
                                              <th>Dep_Id.</th>
                                              <th>Dep name</th>

                                          </tr>
                                      </thead>
                                      <tbody>
                                      <%
                                          Class.forName("org.sqlite.JDBC");
                                          Connection conn =
                                               DriverManager.getConnection("jdbc:sqlite:info2.db");
                                          Statement stat = conn.createStatement();

                                          ResultSet rs = stat.executeQuery("select * from Departments;");

                                          while (rs.next()) {
                                              out.println("<tr>");
                                              out.println("<td>" + rs.getString("Dep_Id") + "</td>");
                                              out.println("<td>" + rs.getString("DepName") + "</td>");
                                              out.println("</tr>");
                                          }

                                          rs.close();
                                          conn.close();
                                      %>
                                      </tbody>
                                  </table>

                            </div>

                                <div class="box2">

									<a href=/hr/sec/depadd><button type="button">Add</button></a><br/>

									 <a href=/hr/sec/depdel> <button type="button">Delete</button></a><br/>

									<a href=/hr/sec/depup><button type="button">Update</button></a><br/>





                                </div>

           </div>
        </div>

    </body>



</html>