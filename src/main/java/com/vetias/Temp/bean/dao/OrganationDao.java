package com.vetias.Temp.bean.dao;

import java.sql.Statement;

import com.vetias.Temp.bean.Organation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrganationDao {
   
   public void createTable(Connection dbConnection) {
      
     
       try( Statement statement= dbConnection.createStatement()){

         statement.execute("""
                     create table organation(
                       NAME VARCHAR(100),
                       WEBSITE VARCHAR(100),
                       EMAIL VARCHAR(100),
                       CONTACT_NUMBER VARCHAR(100),
                       REGISTRATION_NO INT)
                          """);
     }catch(SQLException sqlException){
          
            System.out.println("error creating table:"+  sqlException);
     }

       }


public int save(Connection dbConnection, Organation vet){

   try(PreparedStatement preparedStatement = dbConnection.prepareStatement("""
       insert into organization(name,email,contant number,
       registration_no,description)values(?,?,?,?,?,?)
       
              """ )){
               preparedStatement.setString(1,vet.name());
               preparedStatement.setString(2,vet.website());
               preparedStatement.setString(3,vet.email());
               preparedStatement.setString(4,vet.contactNumber());
               preparedStatement.setLong(5,vet.registrationNumber());
            //   preparedStatement.setTime(6, vet.registrationDate());
               preparedStatement.executeUpdate();
            
              }catch (SQLException sqlException){
               System.out.println("error inserting into table :" + sqlException);
              }
   return 0;

}


      }
   //   JdbcDataSource.h2DataSource =new JdbcDataScource();
   //   h2DataSource.setUr1("jdbc:h2:mem:tempdataDB");
   //   h2DataSource.setUser("sa");
   //    try {
   //       Class.forName("org.h2.Driver");
   //    } catch (ClassNotFoundException e) {
   //       // TODO Auto-generated catch block
   //       e.printStackTrace();
   //    }

   //   try(Connection dbConnection = DriverManager.getConnection("jdbc:h2:mem:tempdataDB", "sa", null);
   //      Statement statement = dbConnection.createStatement();){            
   //                 statement.execute("""
   //                    create table organation(
   //                    id int AUTO_INCREMENT PRIMARY KEY,
   //                    NAME VARCHAR(100),
   //                    WEBSITE VARCHAR(100),
   //                    EMAIL VARCHAR(100),
   //                    CONTACT_NUMBER VARCHAR(100),
   //                    REGISTRATION_NO INT)
   //                    """);
   //   }catch(SQLException e){
   //      System.out.println("error creating table:"+ e.getMessage());
   //   }



                      

                


    



