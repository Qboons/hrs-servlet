package pl.project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by Qbon on 2017-06-23.
 */
public class ConnectionDbDepratment {
    public  void addDep( String depName ){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");

            Statement stmt=c.createStatement();

            String SQlAdd="insert into"
                    + " Departments(DepName) "
                    +   "values('"+depName+"')";

            stmt.executeUpdate(SQlAdd);
            c.commit();
            stmt.close();
            c.close();


        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }
    public void selectDep(){
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
    public void deleteDep(Integer Dep_id){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");
            Statement stmt=c.createStatement();
            String SQlDelete="delete from Departments where Dep_Id="+Dep_id;

            stmt.executeUpdate(SQlDelete);
            c.commit();
            stmt.close();
            c.close();


        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }
    public void updateDep(Integer Dep_id, String newDepName){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");



            Statement stmt=c.createStatement();


                    String SQlUpdate="UPDATE Departments set DepName='"+newDepName+ "'"
                            +"where Dep_Id="+Dep_id;


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
