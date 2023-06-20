package com.cjc.service;

import java.util.List;

import com.cjc.model.Mobile;

public interface MobileService {
	
	public void  saveMobile(Mobile mob);
	
	public void  updateMobile(Mobile mob);
	
	public Mobile  getSingleMobile(int id);
	
	public List<Mobile>  getAllMobile();
	
	public void  deleteMobile(Mobile mob);
	
	public void  deleteAllMobile();
	
}
