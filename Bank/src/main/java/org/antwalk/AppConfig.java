package org.antwalk;


import java.util.Scanner;

import org.antwalk.customers.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.antwalk")
public class AppConfig 
{
	@Bean
	public Customer setAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter UserName");
		String Uname=sc.next();
		System.out.println("Enter Password");
		String password=sc.next();
		System.out.println("Enter SSN");
		String SSN=sc.next();
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter Address");
		String address=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter Phone Number");
		long phone=sc.nextLong();
		System.out.println("Enter Balance");
		float bal=sc.nextFloat();
		System.out.println("Enter type of account");
		String type=sc.next();
		sc.close();
		return new Customer(name,Uname,password,SSN,email,address,age,phone,bal,type);
	}
}
