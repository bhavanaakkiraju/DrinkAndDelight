package com.capgemini.service;

import java.util.Date;

import com.capgemini.dao.UpdateDao;

public class UpdateService {
public void Service(Date date1,Date date2) {
	UpdateDao oo=new UpdateDao();
	oo.Update(date1,date2);
}
}
