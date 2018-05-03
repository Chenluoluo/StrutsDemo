package com.city.erp.service;

import java.util.List;

import com.city.erp.model.UserModel;

public interface IUserService {
	public void add(UserModel userModel) throws Exception;
	public void delete(UserModel userModel) throws Exception;
	public List<UserModel> getAllList() throws Exception;
}
