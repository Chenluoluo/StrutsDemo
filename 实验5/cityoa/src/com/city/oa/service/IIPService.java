package com.city.oa.service;

import com.city.oa.model.IPModel;

public interface IIPService {
	public void add(IPModel im) throws Exception;
	public boolean check(String ip) throws Exception;
}
