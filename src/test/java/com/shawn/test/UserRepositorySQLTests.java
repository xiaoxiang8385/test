package com.shawn.test;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shawn.test.domain.User;
import com.shawn.test.service.UserRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositorySQLTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() throws Exception {
		
		
		int ti = userRepository.modifyByIdAndUserId("wanglei", 3L);
		System.out.println(ti);
		
		
		User a = userRepository.findByEmailAddress("xiaoxiang@123.com");
		
		System.out.println(a.getUserName());
		
	}

}