package info.orm;

import java.sql.SQLException;
import java.util.ArrayList;

public class DisplayData
{
 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		RetrieveData retrieveData=new RetrieveData();
		ArrayList<Employee> arrayList = retrieveData.getDataFromDB();
		for (Employee employee : arrayList)
		{
			System.out.println(employee.getEid());
			System.out.println(employee.getEname());
			System.out.println(employee.getEsalary());
		}
	}
}
