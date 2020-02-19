package com.capgemini.ui;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.service.UpdateService;

public class UpdateUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		HashMap<Integer,String> p=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		Date date1 = null;
		try {
			 date1=sdf.parse("2020-02-19");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date2=new Date(); 
		UpdateService t=new UpdateService();
		t.Service(date1,date2);
	}

}
