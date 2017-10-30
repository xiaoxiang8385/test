package com.shawn.test.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.shawn.test.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
	Page<User> findAll(Pageable pageable);
	Page<User> findByUserName(String string, Pageable pageable);
	
	
	
	@Transactional 
	@Modifying
	@Query("update User u set u.userName = ?1 where u.id = ?2")
	int modifyByIdAndUserId(String  userName, Long id);
		
	@Transactional
	@Modifying
	@Query("delete from User where id = ?1")
	void deleteByUserId(Long id);
	  
	@Transactional(timeout = 10)
	@Query("select u from User u where u.email = ?1")
	    User findByEmailAddress(String email);
}