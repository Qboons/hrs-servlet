<%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>

<!DOCTYPE html>
<html>
    <head>
        <title>HREmployees</title>
        <link rel="stylesheet" href="../css/style.css" />

    </head>

    <body>
     <div id="container">

             <div id="bar">
                            <h1>Delete employee</h1>
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
         <form name="delForm" method="post" action="empdel">
		 <table>
			<tr>
				<%
                     try{
                     //Class.forName("org.sqlite.JDBC").newInstance();
                     Connection connection =
                      DriverManager.getConnection
                                 ("jdbc:sqlite:info2.db");

                    Statement statement = connection.createStatement() ;
                    resultset =statement.executeQuery("select * from Employees") ;
                    %>

                  <td>Employee:</td>
					<td>
                    <select name="Emp_Id">
                   <%  while(resultset.next()){ %>
                       <option value='<%= resultset.getString("Emp_Id")%>'>
					   <%= resultset.getString("Emp_Id")%>;
                       <%= resultset.getString("FirstName")%>;
                        <%= resultset.getString("LastName")%>
                       </option>

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




    </body>



</html>