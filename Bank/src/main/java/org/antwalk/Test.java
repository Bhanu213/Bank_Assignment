package org.antwalk;

import org.antwalk.customers.Customer;
import org.antwalk.customers.CustomerCurrent;
import org.antwalk.customers.CustomerSavings;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test
{

	public static void main(String[] args)
	{
		System.out.println("Open your Account\n");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Customer c=context.getBean(Customer.class);
		if(c.getChoice().equals("Savings"))
		{
			System.out.println("\nYour Account Created");
			System.out.println("Your account details are: ");
			c.display();
			CustomerSavings cs=context.getBean(CustomerSavings.class);
			System.out.println("Account Type:"+cs.ac.showAccount());
		}
		else if(c.getChoice().equals("Current"))
		{		
			System.out.println("\nYour Account Created");
			System.out.println("Your account details are: ");
			c.display();
			CustomerCurrent cs=context.getBean(CustomerCurrent.class);
			System.out.println("Account Type:"+cs.ac.showAccount());

		}
		else
		{
			System.out.println("\nInvalid Input\n");
		}
		context.close();
	}

}
