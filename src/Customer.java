import java.util.*;

import javax.swing.text.NumberFormatter;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.text.*;
import java.math.*;

public class Customer {
	private int customerID;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private BigDecimal money;
	private Alamat address;
	private CustomerLevel customerLevel;
	
	//getter/setter
	public int getCustomerID()
	{
		return customerID;
	}
	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}
	//default empty constructor
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String LastName)
	{
		this.lastName = lastName;
	}
	
	public LocalDate getBirthDate()
	{
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate)
	{
		this.birthDate = birthDate;
	}
	
	public BigDecimal getMoney()
	{
		return money;
	}
	public void setMoney(BigDecimal money)
	{
		this.money = money;
	}
	
	public Alamat getAddress()
	{
		return address;
	}
	
	public void setAddress(Alamat address)
	{
		this.address = address;
	}
	
	public CustomerLevel getCustomerLevel()
	{
		return this.customerLevel;
	}
	
	public void setCustomerLevel(CustomerLevel customerLevel)
	{
		this.customerLevel = customerLevel;
	}
	
	public Customer(int customerID, String firstName, 
					String lastName, LocalDate birthDate, BigDecimal money)
	{
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.money = money;
	}
	
	public long getAge()
	{
		LocalDate aa = this.birthDate;
		String nama = this.firstName;
		LocalDate now = LocalDate.now();
		long age = ChronoUnit.YEARS.between(this.birthDate, now);
		return age;
	}
	
	public String moneyFormat()
	{
		Locale indonesia = new Locale("id","ID");
		String indoFormat = NumberFormat.getCurrencyInstance(indonesia).format(this.money);
		return indoFormat;
	}
	
	public void printSummary()
	{
		System.out.printf("Customer nomor: %d, %s %s. Sekarang berumur %d dengan digital cash %s\n", 
							this.customerID, this.firstName,this.lastName,getAge(),moneyFormat());
	}
	
	
}
