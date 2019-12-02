//package com.webApp.dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class DBConnection {
//protected static Connection getConnectionToDatabase() throws SQLException, ClassNotFoundException {
//
//    String dbUrl = "jbdc:mysql//localhost:8090/";
//
//    String dbName = "student";
//    String dbUsername = "root";
//    String dbPassword ="root";
//
//
//
//    Class.forName("com.mysql.jdbc.Driver");
//    Connection con = DriverManager.getConnection(dbUrl+dbName,  dbUsername,dbPassword);
//
//    PreparedStatement statement = con.prepareStatement(query);
//    return  con;
//
//
//
//    }
//}
//
