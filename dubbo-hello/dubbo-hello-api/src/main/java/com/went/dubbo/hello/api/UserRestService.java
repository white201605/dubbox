package com.went.dubbo.hello.api;

import javax.validation.constraints.Min;

public interface UserRestService {

	User getUser(@Min(value = 1L, message = "User ID must bu grater than 1") Long id);
}
