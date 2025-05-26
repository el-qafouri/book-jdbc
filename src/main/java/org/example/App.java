package org.example;

import java.sql.Connection;

public class App
{
    public static void main( String[] args ) throws Exception
    {
  Connection dbConnection = DBConnection.getConn();
        System.out.println("connected..." + dbConnection);

        dbConnection.close();
    }
}
