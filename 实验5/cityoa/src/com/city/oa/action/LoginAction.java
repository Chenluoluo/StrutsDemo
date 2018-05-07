package com.city.oa.action;

import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.ServletContextAware;

import com.city.oa.model.IPModel;
import com.city.oa.service.IIPService;
import com.city.oa.service.impl.IPServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements ServletContextAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServletContext servletContext = null;
	private String username = null;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String login() throws Exception {
		// TODO Auto-generated method stub
		IIPService ipService = new IPServiceImpl();
		IPModel im = new IPModel();
		String ip = ServletActionContext.getRequest().getRemoteAddr();
		System.out.println(ip);
		im.setId(1);
		im.setIp(ip);
		ipService.add(im);
		
		
		ActionContext actionContext = ActionContext.getContext();
		Map session = (Map)actionContext.getSession();
		session.put("username", username);
		
		return "success";
	}

	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		servletContext = arg0;
	}
}
