package com.cjc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cjc.mapper.MobileMapper;
import com.cjc.model.Mobile;
@Component
public class MobileDao {
	@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void saveMobile(Mobile mob)
	{
		String insert="insert into mobile values("+mob.getId()+",'"+mob.getName()+"',"+mob.getPrice()+",'"+mob.getSpecification()+"','"+mob.getWarranty()+"')";
		template.update(insert);
		System.out.println("Inserted"+insert);
	}
	
	public void updateMobile(Mobile mob)
	{
		String update="update mobile set name='"+mob.getName()+"',price="+mob.getPrice()+" where id="+mob.getId()+"";
		template.update(update);
		System.out.println("Updated"+update);
	}
	public Mobile getSingleMobile(int id)
	{
		String get="select * from Mobile where id=?";
		Mobile mobile = template.queryForObject(get, new MobileMapper(), new Object[] {id});
		
		return mobile;
		
		
	}
	public List<Mobile> getAllMobile()
	{
		String getAll="Select * from Mobile";
		List<Mobile> list = template.query(getAll, new MobileMapper());
		return list;
	}
	
	public void deleteSingleMobile(Mobile mob)
	{
		String delete="delete from Mobile where id="+mob.getId()+"";
		template.update(delete);
		System.out.println("Deleted"+delete);
	}
	public void deleteAllMobile()
	{
		String dl="delete from Mobile";
		template.update(dl);
		System.out.println("Deleted");
		
	}
	

}
