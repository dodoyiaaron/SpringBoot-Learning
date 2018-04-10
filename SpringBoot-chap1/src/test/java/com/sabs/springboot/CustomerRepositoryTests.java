/**  
 * <b>Project Name:</b> springDemo-2  
 * <b>File Name:</b> CustomerRepositoryTests.java  
 * <b>Package Name:</b> com.sabs.springboot  
 * <b>Date:</b> 2018年4月3日下午2:21:01  
 * Copyright (c) 2018, amazingb886@163.com All Rights Reserved.  
 *  
 */  
  
package com.sabs.springboot;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.sabs.springboot.entity.Customer;
import com.sabs.springboot.repository.CustomerRepository;
import static org.assertj.core.api.Assertions.assertThat;

/**  
 * <b>ClassName:</b> CustomerRepositoryTests  
 * <b>Function:</b> TODO ADD FUNCTION. <br/>  
 * <b>Reason:</b> TODO ADD REASON. <br/>   
 * @author   bo.dong  
 * @version    
 * @since    JDK 1.9 
 * @see        
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTests {
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private CustomerRepository customers;
	
	@Test
	public void testFindByLastName() {
		Customer customer = new Customer("first", "last");
		entityManager.persist(customer);
		
		List<Customer> findByLastName = customers.findByLastName(customer.getLastName());
		assertThat(findByLastName).extracting(Customer::getLastName).containsOnly(customer.getLastName());
	}
}
  
