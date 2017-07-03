package com.jk.service;

public class UserServiceImpl implements UserService {

	@Override
	public String queryUser(String name, String sex) {
		System.out.println("My name is"+name +"and sex"+sex );
		return name;
	}

	@Override
	public void queryById(String name, Integer age) {
		System.out.println("name是"+name+"age是"+age);
	}

}
