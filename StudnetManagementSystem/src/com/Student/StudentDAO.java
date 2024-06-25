package com.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO 
{
  public static boolean insertStudentToDB1(std2 s)
  {
	  boolean f=false;
	  try
	  {
		  Connection connection =conp.createC();
		  String q="insert into students(name,phoneno,city) values(?,?,?)";
	      PreparedStatement ps=connection.prepareStatement(q);
	      ps.setString(1,s.getName());
	      ps.setString(2,s.getPhoneno());
	      ps.setString(3,s.getCity());
	      
	      
	      ps.executeUpdate();
	      f=true;
	  }
	  catch(Exception c)
	  {
		 c.printStackTrace();
	  }
	  return f;
  }
 
}
 

