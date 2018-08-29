package pl.project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by Qbon on 2017-06-22.
 */
public class ConnectionDbUser {
    boolean userIsGood=false;
    public boolean checkUser( String login, String password ) {
        Connection c = null;

        try {

            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");
            Statement stmt = c.createStatement();

            String SqlRead = "select * from Users";
            ResultSet rs = stmt.executeQuery(SqlRead);
            System.out.println("Id\tUserName\tPassowrd");
            while (rs.next()) {
                int id = rs.getInt("User_Id");
                String log = rs.getString("UserName");
                String pass = rs.getString("Password");
                System.out.println(id + "\t" + log + "\t" + pass);
                if((login.equals(log)) && (password.equals(pass))){
                    userIsGood=true;
                }
            }
            rs.close();
            stmt.close();
            c.close();

        } catch (Exception ex) {

            System.out.println("cannot connect");

        }
        return userIsGood;
    }





    public void deleteEmp(Integer Emp_id){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");
            Statement stmt=c.createStatement();
            String SQlDelete="delete from Employees where Emp_Id="+Emp_id;

            stmt.executeUpdate(SQlDelete);
            c.commit();
            stmt.close();
            c.close();


        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }
    public void updateEmp(Integer emp_id, String newFName,String newLName,int newAge,Double newSalary,String newSex,int newJobId,int newDepId){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");



            Statement stmt=c.createStatement();


            String SQlUpdate="UPDATE Employees set FirstName='"+newFName+ "'"
                    +", LastName='"+newLName+"'"
                    +", Age='"+newAge+"'"
                    +", Salary='"+newSalary+"'"
                    +", Sex='"+newSex+"'"
                    +", Job_Id='"+newJobId+"'"
                    +", LastName='"+newDepId+"'"
                    +"where Emp_Id="+emp_id;


            stmt.executeUpdate(SQlUpdate);
            c.commit(); //add //delete/ update
            stmt.close();
            c.close();




        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }
}
