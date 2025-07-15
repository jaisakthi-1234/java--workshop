package com.vetias.Temp.bean.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OrganationDao {
   
   public void createTable() {
        try {
         Class.forName("org.h2.Driver");
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
     
       try(Connection  dbConnection=DriverManager.getConnection("jdbc:h2:mem:tempdataDB", "sa", null);
       Statement statement= dbConnection.createStatement()){

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



                      

                


    



