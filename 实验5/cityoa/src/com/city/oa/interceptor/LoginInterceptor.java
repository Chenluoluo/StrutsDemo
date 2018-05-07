package com.city.oa.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		Map session = arg0.getInvocationContext().getSession();
		System.out.println(session.get("username"));
		if (session.get("username") == null)
			return "login";
		return arg0.invoke();
	}

}
