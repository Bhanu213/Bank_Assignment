package org.antwalk.customers;

import org.antwalk.interfaces.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("CustomerCurrent")
public class CustomerCurrent
{
	@Autowired
	@Qualifier("Current")
	public Account ac;
}
