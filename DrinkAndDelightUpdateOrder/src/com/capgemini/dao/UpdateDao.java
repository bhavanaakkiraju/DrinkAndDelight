package com.capgemini.dao;

import java.util.Date;

public class UpdateDao {
public void Update(Date date1,Date date2) {
	if(date1.equals(date2))
	{
		System.out.println("Order will be placed by the end of the day");
	}
	else if(date1.before(date2))
	{
		System.out.println("Order is delivered");
		
	}
	else if(date1.after(date2))
	{
		System.out.println("Order will be delivered soon");
	}
	
}
}
