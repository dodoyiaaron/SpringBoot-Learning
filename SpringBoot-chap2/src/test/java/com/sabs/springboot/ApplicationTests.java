/**  
 * <b>Project Name:</b> springDemo-1  
 * <b>File Name:</b> ApplicationTests.java  
 * <b>Package Name:</b> com.sabs.springboot  
 * <b>Date:</b> 2018年3月29日上午10:50:32  
 * Copyright (c) 2018, amazingb886@163.com All Rights Reserved.  
 *  
 */  
  
package com.sabs.springboot;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sabs.springboot.bean.BlogProperties;

import junit.framework.Assert;

/**  
 * <b>ClassName:</b> ApplicationTests  
 * <b>Function:</b> TODO ADD FUNCTION. <br/>  
 * <b>Reason:</b> TODO ADD REASON. <br/>   
 * @author   bo.dong  
 * @version    
 * @since    JDK 1.9 
 * @see        
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	
	@Autowired
	private BlogProperties blogProperties;

	@SuppressWarnings("deprecation")
	@Test
	public void test() throws UnsupportedEncodingException {
		Assert.assertEquals(blogProperties.getTitle(), "Spring Boot 学习");
		Assert.assertEquals(blogProperties.getName(), "程序猿GG");
		
	}

}
  
