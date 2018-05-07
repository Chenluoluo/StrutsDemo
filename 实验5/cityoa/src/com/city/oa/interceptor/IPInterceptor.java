package com.city.oa.interceptor;

import org.apache.struts2.ServletActionContext;

import com.city.oa.service.IIPService;
import com.city.oa.service.impl.IPServiceImpl;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class IPInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		IIPService ipService = new IPServiceImpl();
		String ip = ServletActionContext.getRequest().getRemoteAddr();
		if (ipService.check(ip)) {
			return "error";
		} else {
			return arg0.invoke();
		}
	}

}
