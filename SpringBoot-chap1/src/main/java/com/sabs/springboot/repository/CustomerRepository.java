/**  
 * <b>Project Name:</b> springDemo-2  
 * <b>File Name:</b> CustomerRepository.java  
 * <b>Package Name:</b> com.sabs.springboot.repository  
 * <b>Date:</b> 2018年4月3日下午1:50:37  
 * Copyright (c) 2018, amazingb886@163.com All Rights Reserved.  
 *  
 */  
  
package com.sabs.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sabs.springboot.entity.Customer;

/**  
 * <b>ClassName:</b> CustomerRepository  
 * <b>Function:</b> TODO ADD FUNCTION. <br/>  
 * <b>Reason:</b> TODO ADD REASON. <br/>   
 * @author   bo.dong  
 * @version    
 * @since    JDK 1.9 
 * @see        
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);


}
  
