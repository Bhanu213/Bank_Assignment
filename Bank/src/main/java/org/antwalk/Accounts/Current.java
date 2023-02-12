package org.antwalk.Accounts;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("Current")
public class Current implements Account
{
	public String showAccount()
	{
		return "Current Account";
	}
}
