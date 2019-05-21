import java.util.*;
import java.time.*;
import java.math.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer michael = new Customer(23,"Michael","Jackson",
										LocalDate.of(1976, Month.MAY, 16),new BigDecimal(12000000));
		
		Customer andrea = new Customer(25,"Andrea","Bocelli",
										LocalDate.of(1973, Month.NOVEMBER, 23),new BigDecimal(15300000));
		
		Customer bob = new Customer(27,"Bob","Marley",
										LocalDate.of(1968, Month.MARCH, 1),new BigDecimal(2450000));
		
		//number 4
		LinkedList<Customer> customerList = new LinkedList<Customer>();
		customerList.add(michael);
		customerList.add(andrea);
		customerList.add(bob);
		
		//number 3
		bob.setFirstName("Robert");
		//number 5
		for(Customer pembeli : customerList)
		{
			
			pembeli.printSummary();
		}
		
		Alamat alamatMichael = new Alamat();
		alamatMichael.setCountry("USA");
		alamatMichael.setState("California");
		alamatMichael.setCity("Los Angeles");
		alamatMichael.setAddress("Truman Street B34 Unit 5");
		
		michael.setAddress(alamatMichael);
		
		michael.setCustomerLevel(CustomerLevel.GOLD);
		
		
	}

}
