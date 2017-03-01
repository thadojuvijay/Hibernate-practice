package info.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertAddressData 
{
public void save(Address address) throws SQLException, ClassNotFoundException
{
	
	
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bms", "abc");
	PreparedStatement prepareStatement = connection.prepareStatement("insert into Address values(?,?,?,?,?)");
	prepareStatement.setString(1, address.getStreet());
	prepareStatement.setString(2, address.getCity());
	prepareStatement.setString(3, address.getState());
	prepareStatement.setString(4, address.getCountry());
	prepareStatement.setInt(5, address.getPincode());
	
	prepareStatement.executeUpdate();
	connection.close();
}
}
