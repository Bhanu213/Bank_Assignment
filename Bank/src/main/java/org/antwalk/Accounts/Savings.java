package org.antwalk.Accounts;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("Savings")
public class Savings implements Account
{
	public String showAccount()
	{
		return "Savings Account";
	}
}