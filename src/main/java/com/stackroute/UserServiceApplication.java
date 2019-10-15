package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.security.auth.login.Configuration;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(UserServiceApplication.class, args);
		//it configure beans for the whole application and looks for component it create bean we dont even need to ask and getBean is not required
		User user = context.getBean(User.class);

		user.getUserMobile();
	}

}
