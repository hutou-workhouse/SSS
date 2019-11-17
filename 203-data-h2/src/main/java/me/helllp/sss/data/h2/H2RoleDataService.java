package me.helllp.sss.data.h2;

import java.util.List;

import me.helllp.sss.data.bean.RoleBean;
import me.helllp.sss.data.bean.UserInfoBean;
import me.helllp.sss.data.service.RoleDataService;

public class H2RoleDataService implements RoleDataService{

	@Override
	public List<RoleBean> getRoleByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createRole(RoleBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteRole(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateRole(RoleBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserInfoBean searchUserListByRole(String roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
