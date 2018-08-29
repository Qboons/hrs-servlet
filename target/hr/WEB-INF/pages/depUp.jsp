<%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>
<!DOCTYPE html>
<html>
    <head>
        <title>HRDepratment</title>
        <link rel="stylesheet" href="../css/style.css" />

    </head>

    <body>
           <div id="container">

             <div id="bar">
                            <h1>Update department</h1>
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
                                    <form id="form1" name="addingForm" method="post" action="depup">
                                    <table>
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
                                               <option value='<%= resultset.getString("Dep_Id")%>'>
                                               <%= resultset.getString("Dep_Id")%>
                                               ;<%= resultset.getString("DepName")%></option>

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
                                    <td>New name:</td>
                                    <td><input type="text" name="DepName"/></td>
                                    </tr>
                                    </table>
                                    <tr>

                                    </tr>

                                    <input type="submit" value="Submit" />

                                    </form>
                                </div>


        </div>
    </body>



</html>