package com.cjc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cjc.model.Mobile;

public class MobileMapper implements RowMapper<Mobile>{

	public Mobile mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Mobile m=new Mobile(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4),rs.getString(5));
		
		
		return m;
	}
	

}
