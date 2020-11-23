package com.taylor.rmi.common;

import com.taylor.rmi.common.bean.User;

public interface IUserService {

	User getUserByName(String username);
	
}
