/**  
 * <b>Project Name:</b> springDemo-1  
 * <b>File Name:</b> BeanConfiguration.java  
 * <b>Package Name:</b> com.sabs.springboot.bean  
 * <b>Date:</b> 2018年3月28日下午3:27:09  
 * Copyright (c) 2018, amazingb886@163.com All Rights Reserved.  
 *  
 */  
  
package com.sabs.springboot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**  
 * <b>ClassName:</b> BeanConfiguration  
 * <b>Function:</b> TODO ADD FUNCTION. <br/>  
 * <b>Reason:</b> TODO ADD REASON. <br/>   
 * @author   bo.dong  
 * @version    
 * @since    JDK 1.9 
 * @see        
 */
public class BeanConfiguration {
	@Bean
	@Profile("dev")
	public Runnable test1() {
		System.out.println("开发环境使用的 Bean");
		return () -> {};
	}
	
	@Bean
	@Profile("test")
	public Runnable test2() {
		System.out.println("测试环境使用的 Bean");
		return () -> {};
	}
	
	@Bean
	@Profile("pro")
	public Runnable test3() {
		System.out.println("生产环境使用的 Bean");
		return () -> {};
	}
}
  
