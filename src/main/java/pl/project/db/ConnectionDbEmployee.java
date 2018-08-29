package pl.project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Qbon on 2017-06-23.
 */
public class ConnectionDbEmployee {
    public  void addEmp( String fName,String lName, int age, double salary, String sex, int job_id, int dep_id  ){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");

            Statement stmt=c.createStatement();

            String SQlAdd="insert into"
                    + " Employees(FirstName,LastName,Age,Salary,Sex,Job_Id,Dep_Id) "
                    +   "values('"+fName+"','"+lName+"','"+age+"','"+salary+"','"+sex+"','"+job_id+"','"+dep_id+"')";

            stmt.executeUpdate(SQlAdd);
            c.commit();
            stmt.close();
            c.close();


        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }
    public void selectEmp(){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");
            Statement stmt=c.createStatement();

            String SqlRead="select * from Departments";
            ResultSet rs= stmt.executeQuery(SqlRead);
            System.out.println("Id\tName\t");
            while (rs.next()){
                int id = rs.getInt("Dep_Id");
                String DepName=rs.getString("DepName");
                System.out.println(id+"\t"+DepName);
            }
            rs.close();
            stmt.close();
            c.close();

        }catch(Exception ex){
            System.out.println("cannot connect");
            //System.exit(0);
        }
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
            c.commit();
            stmt.close();
            c.close();




        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }
}
