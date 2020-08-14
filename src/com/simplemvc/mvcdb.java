package com.simplemvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class mvcdb {
	public static List<Food> list=new ArrayList();
	public static  List<Food> getdata() throws SQLException
	{
		try {
			    Class.forName("com.mysql.jdbc.Driver");
			    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","");
			    Statement st=cn.createStatement();
			    ResultSet rs=st.executeQuery("select * from foodcart");
			    while(rs.next())
			    {
			    	int id=rs.getInt(1);
			    	String name=rs.getString(2);
			    	Food f=new Food(id,name);
			    	list.add(f);
			    	//return list;
			    	
			    }
			    		
		}
		catch(ClassNotFoundException er)
		{
				System.out.println(er.getMessage());
		}
		return list;
	}

}
