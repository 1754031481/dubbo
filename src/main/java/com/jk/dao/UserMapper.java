package com.jk.dao;

import java.util.List;
import java.util.Map;

import com.jk.model.User;

public interface UserMapper {

	User loginDiMeng(User user);

	void updatePassWord(Map<String, Object> map);

	List<Map<String, Object>> userList(User user);

	List<Map<String, Object>> userSex(User user);
	
   
}