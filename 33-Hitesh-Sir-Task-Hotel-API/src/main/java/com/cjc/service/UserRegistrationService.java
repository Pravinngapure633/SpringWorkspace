package com.cjc.service;

import com.cjc.model.UserDetail;

public interface UserRegistrationService {

	void createProfile(UserDetail userdetail);

	UserDetail loginCheck(String userName, String userPassword);

}
