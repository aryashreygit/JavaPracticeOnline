package PavanClasses.PavanKumarYTClasses.DerivedDataTypesArrayListHashMapEtc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) throws SQLException {
        //Declaration
        //HashMap hm = new HashMap();

        HashMap <Integer, String> hm  = new HashMap<Integer, String>();     //HashMap is used for Key Value
        //Based on your data you have to define Key vs Value

        //Adding pairs into HashMap
        hm.put(101, "John1");
        hm.put(102, "John2");
        hm.put(103, "John3");
        hm.put(104, "John4");

        System.out.println(hm);

        //Remove a pair from HashMap
        hm.remove(103);
        System.out.println("After removing a pair" +hm);

        //How to Read Values Using For Loop, reading pairs using For Loop
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+ "  "+m.getValue());
        }


        Connection con = DriverManager.getConnection("url");

        //Create a query/statement
        Statement stmt = con.createStatement();
        String s="insert into student values(105,'Scott')";
        String s1="select employee_id, firstname, lastname from employees";

        //Execute the Statement
        stmt.executeQuery(s);
        //Once you execute Select query it will return some values
        ResultSet rs = stmt.executeQuery(s1);

        while(rs.next())         //if you dont know how many records are there
        {
            int eid=rs.getInt("Employee ID");
            String fname = rs.getString("FirstName");
            String lname = rs.getString("LastName");
        }

        //Close Connection
        con.close();




    }
}
