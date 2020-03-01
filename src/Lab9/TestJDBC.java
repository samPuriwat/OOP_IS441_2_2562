package Lab9;

import java.sql.*;
import java.util.ArrayList;

public class TestJDBC {
    public static void main(String[] args) {

        //step 1 : load driver
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver load successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //step 2 : create connection
        String SQCONN = "jdbc:sqlite:RUTS.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null) {
                System.out.println("Could not connect to database.");
            }else {
                System.out.println("Connected to database.");
            }

            //step 3: create statements
            Statement stmt = conn.createStatement();
            String sql = "select * from student";
            ResultSet rs = stmt.executeQuery(sql);
            //step 4: get data from database
            if (rs == null) {
                System.out.println("Could not found any data.");
            } else {
                System.out.println("Student data from database: ");
                ArrayList<Student> std = new ArrayList<Student>();
                while (rs.next()) {
//                    System.out.println("#######################");
//                    System.out.println("SID:"+rs.getInt(1));
//                    System.out.println("Name:"+rs.getString(2));
//                    System.out.println("Major:"+rs.getString(3));
//                    System.out.println("GPA:"+rs.getDouble(4));
                    Student s = new Student(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getDouble(4));
                    // store objects into ArrayList
                    std.add(s);
                }//while
                //display data as object
                DisplayObject(std);
            }
            //step 5: close all connection
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//main

    private static void DisplayObject(ArrayList<Student> std) {

        for (Student s:std) {
            System.out.println(s.toString());
        }

    }
}//class
