package org.antwalk.customers;



import org.antwalk.interfaces.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class Customer
{
	private String name, userName, password, SSN, email, address;
	private int age;
	private long phone;
	private float balance;
	private String choice;
	public Customer(String name, String userName, String password, String sSN, String email, String address, int age,
			long phone, float balance,String choice) 
	{
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.SSN = sSN;
		this.email = email;
		this.address = address;
		this.age = age;
		this.phone = phone;
		this.balance = balance;
		this.choice=choice;
	}
	
	public Customer(String choice)
	{
		this.choice=choice;
	}
	
	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public Customer()
	{
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public float getBalance() 
	{
		return balance;
	}

	public void setBalance(float balance)
	{
		this.balance = balance;
	}
	
	public void display()
	{
		System.out.println("Name:"+name+"\nUsername:"+userName+"\nSSN:"+SSN+"\nEmail:"+email+"\nAddress:"+address+"\nAge:"+age+"\nPhone:"+phone+"\nBalance:"+balance);
	}

}
