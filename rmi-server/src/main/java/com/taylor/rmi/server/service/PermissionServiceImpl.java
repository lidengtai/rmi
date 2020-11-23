package com.taylor.rmi.server.service;

import org.springframework.stereotype.Service;

import com.taylor.rmi.common.IPermissionService;
import com.taylor.rmi.common.bean.Permission;

@Service
public class PermissionServiceImpl implements IPermissionService {

	@Override
	public Permission getPermissionByName(String pName) {
		Permission permission = null;
		if (pName != null && pName.equals("")) {
			permission = new Permission();
			if (pName.equals("ROLE_ADMIN")) {
				permission.setpName("ROLE_ADMIN");
				permission.setUrlPattern("/**");
			}else{
				permission.setpName("ROLE_ABEL");
				permission.setUrlPattern("/abel**");
			}
		}
		return permission;
	}

}
