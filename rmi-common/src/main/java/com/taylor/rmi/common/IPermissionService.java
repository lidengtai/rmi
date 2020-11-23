package com.taylor.rmi.common;

import com.taylor.rmi.common.bean.Permission;

public interface IPermissionService {

	
	Permission getPermissionByName(String pName);
}
