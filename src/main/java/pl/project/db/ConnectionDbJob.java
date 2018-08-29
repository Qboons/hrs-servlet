package pl.project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Qbon on 2017-06-23.
 */
public class ConnectionDbJob {
    public  void addJob( String jName,double maxSalary,double minSalary,  int dep_id  ){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");

            Statement stmt=c.createStatement();

            String SQlAdd="insert into"
                    + " Jobs(JobName,MaxSalary,MinSalary,Dep_Id) "
                    +   "values('"+jName+"','"+maxSalary+"','"+minSalary+"','"+dep_id+"')";

            stmt.executeUpdate(SQlAdd);
            c.commit();
            stmt.close();
            c.close();


        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }
    public void selectJob(){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");
            Statement stmt=c.createStatement();

            String SqlRead="select * from Jobs";
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
    public void deleteJob(Integer job_id){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");
            Statement stmt=c.createStatement();
            String SQlDelete="delete from Jobs where Job_Id="+job_id;

            stmt.executeUpdate(SQlDelete);
            c.commit();
            stmt.close();
            c.close();


        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }
    public void updateJob(int job_id, String jName,double maxSalary,double minSalary,int dep_id){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");



            Statement stmt=c.createStatement();


            String SQlUpdate="UPDATE Jobs set JobName='"+jName+ "'"
                    +", MaxSalary='"+maxSalary+"'"
                    +", MinSalary='"+minSalary+"'"
                    +", Dep_Id='"+dep_id+"'"
                    +"where Job_id="+job_id;


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
