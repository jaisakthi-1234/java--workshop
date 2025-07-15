package com.vetias.Temp.bean.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vetias.Temp.bean.Organation;

public class JDBCExample {
    public static void main(String[] args) {
        // OrganationDao organationDao=new OrganationDao();
        // organationDao.createTable();


     Connection dbConnection =null;
     try{
        Class.forName("org.h2.Driver");

     }catch (ClassNotFoundException e) {
        e.printStackTrace();
     }

     try {
        dbConnection =
     DriverManager.getConnection(
        "jdbc:h2:mem:tempdata", "sa", null);
     
     }catch (SQLException sqlException) {
        System.out.println("error Creating table : " + sqlException);
     }
     OrganationDao organationDao = new OrganationDao();
     organationDao.createTable(dbConnection);
     Organation vet = new Organation("VET","", "WWW.vet.com", "contanct@vet.com", "+91 923847234", 0, null);
     organationDao.save(dbConnection, vet);


    }

}
