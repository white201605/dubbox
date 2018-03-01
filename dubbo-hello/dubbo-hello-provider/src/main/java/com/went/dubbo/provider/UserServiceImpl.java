package com.went.dubbo.provider;

import com.went.dubbo.hello.api.User;
import com.went.dubbo.hello.api.UserService;

/**
 * Hello world!
 *
 */
public class UserServiceImpl implements UserService
{

	@Override
	public User getUser(Long id) {
		return new User(id, "username" + id);
	}
}
