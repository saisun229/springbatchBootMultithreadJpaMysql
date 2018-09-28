package com.sai;

import org.springframework.batch.item.ItemProcessor;

import com.sai.bean.User;

public class UserItemProcessor implements ItemProcessor<User, User> {

	 @Override
	 public User process(User user) throws Exception {
	  return user;
	 }

	} 