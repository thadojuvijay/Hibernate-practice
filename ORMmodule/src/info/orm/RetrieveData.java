package info.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RetrieveData 
{
	ArrayList<Employee>arrayList=new ArrayList<Employee>();
public ArrayList<Employee> getDataFromDB() throws SQLException, ClassNotFoundException
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from employee");
	/* which class i open the connection in that class or method i must compulasory
	  close that connection in that method or class only.
	  if we close the connection in that method.when we close 
	  the connection the resultSet object will be gone
	  *so we cannot transfer resultSet object into one program to another program.
	  *if we not have possibilty to transfer the resultset object we cannot access
	  the data  available in the resultset object into another program
	  
	  *then we have the technique to solve this problem.
	  *first we need to create an class name as database table name and then we need to declared
	 the  instance variables in the class is depends on how many columns available in that
	 database table name and next we need to setter&getter methods to store and display the data.
	 
	 *and create the object object of this class employee and store that 
	  
	 * 
	 * 
	 * 
	 * */
	
	while(resultSet.next())
	{
		Employee employee=new Employee();
		employee.setEid(resultSet.getInt(1));
	employee.setEname(resultSet.getString(2));
	employee.setEsalary(resultSet.getDouble(3));
		arrayList.add(employee);
	}
	/* 
	 * scope of that employee object will be in that method or loop or constructor or 
	 * block only. we cannot use that object into another program.
	 * 
	 * orm:how many records available in that table.that many times the object will be
	  created.for every one row of record.one object will created.
	 * 
	 *  iam creating an ArrayList and storing these objects into the ArrayList
	 * and then return the ArrayList object 
	 * and iam using that arrayList  object into another class and 
	 * displaying the data available in the Arraylist 
	 * */
	return arrayList;
	
}
}
