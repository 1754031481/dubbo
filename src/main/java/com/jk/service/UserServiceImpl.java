package com.jk.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.UserMapper;
import com.jk.model.User;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<Map<String, Object>> userList(User user) {
		return userMapper.userList(user);
	}

	@Override
	public List<Map<String, Object>> userSex(User user) {
		return userMapper.userSex(user);
	}
	 


	

}
