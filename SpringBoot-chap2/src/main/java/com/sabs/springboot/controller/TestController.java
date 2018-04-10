/**  
 * <b>Project Name:</b> springDemo-1  
 * <b>File Name:</b> TestController.java  
 * <b>Package Name:</b> com.sabs.springboot.controller  
 * <b>Date:</b> 2018年3月28日下午2:47:22  
 * Copyright (c) 2018, amazingb886@163.com All Rights Reserved.  
 *  
 */  
  
package com.sabs.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**  
 * <b>ClassName:</b> TestController  
 * <b>Function:</b> TODO ADD FUNCTION. <br/>  
 * <b>Reason:</b> TODO ADD REASON. <br/>   
 * @author   bo.dong  
 * @version    
 * @since    JDK 1.9 
 * @see        
 */
@RestController
public class TestController {
	@GetMapping("/helloo")
	public String helloWorld() {
		return "hello world!";
	}

	@GetMapping("/helloBo") 
	public String helloBo() {
		return "We all love you!";
	}
}
  
