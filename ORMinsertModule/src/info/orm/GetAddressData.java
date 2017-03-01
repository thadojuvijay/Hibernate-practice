package info.orm;

import java.sql.SQLException;
import java.util.Scanner;

public class GetAddressData {

	private static Scanner scanner;

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	
	{
		Address address=new Address();
		scanner = new Scanner(System.in);
		
		System.out.println("enter the Street");
		String street=scanner.nextLine();
        address.setStreet(street);
        
        System.out.println("enter the city");
        String city = scanner.nextLine();
        address.setCity(city);
        
        System.out.println("enter the state");
        String state = scanner.nextLine();
        address.setState(state);
        
        System.out.println("enter the country");
        String country = scanner.nextLine();
        address.setCountry(country);
        
        System.out.println("enter the pincode");
        Integer pincode = scanner.nextInt();
        address.setPincode(pincode);
        
        InsertAddressData addressData=new InsertAddressData();
        addressData.save(address);
	}

}
