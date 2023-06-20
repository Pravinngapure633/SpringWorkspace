package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.UserDetail;
@Repository
public interface UserRegistrationRepository  extends JpaRepository<UserDetail, Integer>{

	

	UserDetail findByuserName(String userName);

}
