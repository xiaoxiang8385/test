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
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shawn.test.domain.User;
import com.shawn.test.service.UserRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() throws Exception {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);        
		String formattedDate = dateFormat.format(date);
		
//		userRepository.save(new User("xiaoxiang", "hansun123", "xiaoxiang@123.com", "hansun",formattedDate));
//		userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
//		userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));

		System.out.println(userRepository.findAll().size());
		
		User a = userRepository.findByUserNameOrEmail("xiaoxiang", "cc@126.com");
		
		System.out.println(a.getNickName());
	 
//		userRepository.delete(userRepository.findByUserName("aa1"));
		
		System.out.println(userRepository.findAll().size());
		
		int page=1,size=2;
		Sort sort = new Sort(Direction.DESC, "id");
	    Pageable pageable = new PageRequest(page, size, sort);
	    
	    System.out.println(userRepository.findAll(pageable).getSize());
	    userRepository.findByUserName("testName", pageable);

		
		
	}

}