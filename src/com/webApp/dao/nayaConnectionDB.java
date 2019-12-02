package com.webApp.dao;
import javax.xml.transform.Result;
import java.sql.*;

public class nayaConnectionDB {
    public static void main(String[] args) throws Exception
    {
        /*Steps of Java Database Connection
        1) -->> Import the mysql driver
        2) -->> Create and establish the connection
        3) -->> Create the statement to execute
        4) -->> Execute the given query
        5) -->> Close the connection



         */




        //Defining the various parameters
        String url="jdbc:mysql://localhost:3306/student";
        String uname = "root";
        String pass = "";

        //Actual database query we want to perform
        String query = "select name from studentinfo where id_no=2";

        //Loading the JDBC Driver in JVM using Class.forName()
        Class.forName("com.mysql.jdbc.Driver");

        //Establishing the Connection with DB
        Connection con =  DriverManager.getConnection(url,uname,pass) ;

        //Creating the statement to perform the query
        Statement st = con.createStatement();

        //ResultSet contains the result of the query in execution
        // :: it contains the rows that satisfies the condtion of provided query
        ResultSet rs = st.executeQuery(query);

        //rx.next() moves the pointer to the next row
        rs.next();

        //Storing the given returned data from database to the name variable
        String name = rs.getString("name");
        System.out.println(name);

        st.close();
        con.close();

    }

}
