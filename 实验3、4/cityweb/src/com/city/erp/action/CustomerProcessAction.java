package com.city.erp.action;

import java.util.List;

import com.city.erp.model.UserModel;
import com.city.erp.service.IUserService;
import com.city.erp.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerProcessAction extends ActionSupport {
	private UserModel userModel = null;

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	private List<UserModel> list = null;

	public List<UserModel> getList() {
		return list;
	}

	public void setList(List<UserModel> list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String add() throws Exception {
		// TODO Auto-generated method stub
		IUserService userService = new UserServiceImpl();
		System.out.println(userModel.getId());
		System.out.println(userModel.getName());
		System.out.println(userModel.getPerson());
		userService.add(userModel);
		// ActionContext actionContext =
		return "addSuccess";
	}

	public String delete() throws Exception {
		// TODO Auto-generated method stub
		IUserService userService = new UserServiceImpl();
		System.out.println(userModel.getId());
		System.out.println(userModel.getName());
		System.out.println(userModel.getPerson());
		userService.delete(userModel);
		// ActionContext actionContext =
		return "deleteSuccess";
	}
	
	public String select() throws Exception {
		// TODO Auto-generated method stub
		IUserService userService = new UserServiceImpl();
		list = userService.getAllList();
		for (UserModel userModel : list) {
			System.out.println(userModel.getId());
		}
		// ActionContext actionContext =
		return "selectSuccess";
	}
}
