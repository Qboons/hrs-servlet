<%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>


<!DOCTYPE html>
<html>
    <head>
        <title>HRTrainings</title>
        <link rel="stylesheet" href="../css/style.css" />

    </head>

    <body>
    <div id="container">

         <div id="bar">
                        <h1>New Training</h1>
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
        <div class="box">
			<form name="addingForm" method="post" action="traadd">
				<table>
					<tr>
						<td>Name:</td>
						<td><input type="text" name="TrainingName"/></td>
					</tr>
                    <tr>
						<td>Start Date:</td>
						<td><input type="text" name="StartDate"/></td>
					</tr>
                    <tr>
						<td>End Date </td>
						<td><input type="text" name="EndDate"/></td>
					</tr>



                    <tr>

                    <td>Job:</td>
                    <%
                     try{
                     //Class.forName("org.sqlite.JDBC").newInstance();
                     Connection connection =
                      DriverManager.getConnection
                                 ("jdbc:sqlite:info2.db");

                    Statement statement = connection.createStatement() ;
                    resultset =statement.executeQuery("select * from Jobs") ;
                    %>



				 <td>
                    <select name="Job_Id">
                   <%  while(resultset.next()){ %>
                       <option value='<%= resultset.getString("Job_Id")%>'>
                       <%= resultset.getString("Job_Id")%>
                       ;<%= resultset.getString("JobName")%></option>

                        <% } %>
                    </select>


                       <%
                          //**Should I input the codes here?**
                      }
                        catch(Exception e)
                          {
                            out.println("wrong entry"+e);
                          }
                          %>
				</td>
				</tr>
                    <tr>
					<td>Department:</td>
					<td>
                  <%
                     try{
                     //Class.forName("org.sqlite.JDBC").newInstance();
                     Connection connection =
                      DriverManager.getConnection
                                 ("jdbc:sqlite:info2.db");

                    Statement statement = connection.createStatement() ;
                    resultset =statement.executeQuery("select * from Departments") ;
                    %>



                    <select name="Dep_Id">
                   <%  while(resultset.next()){ %>
                       <option value='<%= resultset.getString("Dep_Id")%>'><%= resultset.getString("Dep_Id")%>;<%= resultset.getString("DepName")%></option>

                        <% } %>
                    </select>


                       <%
                          //**Should I input the codes here?**
                      }
                        catch(Exception e)
                          {
                            out.println("wrong entry"+e);
                          }
                          %>

					</td>
				</tr>

				    <tr>
				        <td><input type="submit" value="Submit" /></td>
				    </tr>
				</table>


			</form>
		</div>
	</div>
    </body>

</html>