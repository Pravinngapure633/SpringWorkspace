package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cjc.dao.MobileDao;
import com.cjc.model.Mobile;
@Component
public class MobileServiceImpl  implements MobileService{

	@Autowired
	private MobileDao dao;

	public void setDao(MobileDao dao) {
		this.dao = dao;
	}

	public void saveMobile(Mobile mob) {
		dao.saveMobile(mob);
	}

	public void updateMobile(Mobile mob) {
		
		dao.updateMobile(mob);
	}

	public Mobile getSingleMobile(int id) {
		
		
		return dao.getSingleMobile(id);
	}

	public List<Mobile> getAllMobile() {
		
		return dao.getAllMobile();

	}

	public void deleteMobile(Mobile mob) {
	
		dao.deleteSingleMobile(mob);
	}

	public void deleteAllMobile() {
		
		dao.deleteAllMobile();
	}
	
	
	
}
