package pl.project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Qbon on 2017-06-23.
 */
public class ConnectionDbTraining {
    public  void addTraining( String tName,String startDate,String endDate, int job_id,  int dep_id  ){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");

            Statement stmt=c.createStatement();

            String SQlAdd="insert into"
                    + " Trainings(TrainingName,StartDate,EndDate,Job_Id,Dep_Id) "
                    +   "values('"+tName+"','"+startDate+"','"+endDate+"','"+job_id+"','"+dep_id+"')";

            stmt.executeUpdate(SQlAdd);
            c.commit();
            stmt.close();
            c.close();


        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }
    public void deleteTraining(Integer training_id){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");
            Statement stmt=c.createStatement();
            String SQlDelete="delete from Trainings where Training_Id="+training_id;

            stmt.executeUpdate(SQlDelete);
            c.commit();
            stmt.close();
            c.close();


        }catch(Exception ex){

            System.out.println("cannot connect");
            //System.exit(0);
        }


    }
    public void updateTraining(Integer training_id,String tName,String startDate,String endDate, int job_id,  int dep_id ){
        Connection c=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection("jdbc:sqlite:info2.db");

            System.out.println("connect successfully");



            Statement stmt=c.createStatement();


            String SQlUpdate="UPDATE Trainings set TrainingName='"+tName+ "'"
                    +", StartDate='"+startDate+"'"
                    +", EndDate='"+endDate+"'"
                    +", Job_Id='"+job_id+"'"
                    +", Dep_Id='"+dep_id+"'"
                    +"where Training_Id="+training_id;


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
