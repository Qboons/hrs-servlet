package pl.project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Qbon on 2017-06-23.
 */
public class ConnectionDbProject {
    public  void addProject( String pName,String deadlineDate, int dep_id  ){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");

            Statement stmt=c.createStatement();

            String SQlAdd="insert into"
                    + " Projects(ProjectName,DeadlineDate,Dep_Id) "
                    +   "values('"+pName+"','"+deadlineDate+"','"+dep_id+"')";

            stmt.executeUpdate(SQlAdd);
            c.commit();
            stmt.close();
            c.close();


        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }

    public void deleteProject(Integer project_id){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");
            Statement stmt=c.createStatement();
            String SQlDelete="delete from Projects where Project_Id="+project_id;

            stmt.executeUpdate(SQlDelete);
            c.commit();
            stmt.close();
            c.close();


        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }
    public void updateProject(Integer project_id,String pName,String deadlineDate, int dep_id ){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");



            Statement stmt=c.createStatement();


            String SQlUpdate="UPDATE Projects set ProjectName='"+pName+ "'"
                    +", DeadlineDate='"+deadlineDate+"'"
                    +", Dep_Id='"+dep_id+"'"
                    +"where Project_id="+project_id;


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
