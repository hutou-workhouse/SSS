package me.helllp.sss.data.h2;

import java.util.List;

import me.helllp.sss.data.bean.PagesBean;
import me.helllp.sss.data.bean.TenantBean;
import me.helllp.sss.data.service.TenantDataService;

public class H2TenantDataService implements TenantDataService{

	@Override
	public TenantBean searchTenant(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasUserInTenant(String userId, String tenantId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Long countTenant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TenantBean> searchTenantList(PagesBean pagesInfo,
			TenantBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createTenant(TenantBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTenant(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTenant(TenantBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

}
