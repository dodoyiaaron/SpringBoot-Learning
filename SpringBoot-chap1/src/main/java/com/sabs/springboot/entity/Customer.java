/**  
 * <b>Project Name:</b> springDemo-2  
 * <b>File Name:</b> Customer.java  
 * <b>Package Name:</b> com.sabs.springboot.entity  
 * <b>Date:</b> 2018年4月3日下午1:23:58  
 * Copyright (c) 2018, amazingb886@163.com All Rights Reserved.  
 *  
 */  
  
package com.sabs.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**  
 * <b>ClassName:</b> Customer  
 * <b>Function:</b> TODO ADD FUNCTION. <br/>  
 * <b>Reason:</b> TODO ADD REASON. <br/>   
 * @author   bo.dong  
 * @version    
 * @since    JDK 1.9 
 * @see        
 */
@Entity //由于 跟类同名就不用再声明table
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	
	protected Customer() {
		
	}
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
		return String.format("Customer[id = '%d', firstName = '%s', lastName = '%s']", id, firstName, lastName);
	}

	/**  
	 * id.  
	 *  
	 * @return  the id  
	 * @since   JDK 1.9 
	 */
	public Long getId() {
		return id;
	}

	/**  
	 * id.  
	 *  
	 * @param   id   the id to set  
	 * @since   JDK 1.9 
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**  
	 * firstName.  
	 *  
	 * @return  the firstName  
	 * @since   JDK 1.9 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**  
	 * firstName.  
	 *  
	 * @param   firstName   the firstName to set  
	 * @since   JDK 1.9 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**  
	 * lastName.  
	 *  
	 * @return  the lastName  
	 * @since   JDK 1.9 
	 */
	public String getLastName() {
		return lastName;
	}

	/**  
	 * lastName.  
	 *  
	 * @param   lastName   the lastName to set  
	 * @since   JDK 1.9 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
  
