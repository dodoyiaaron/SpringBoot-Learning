/**  
 * <b>Project Name:</b> springDemo-1  
 * <b>File Name:</b> BlogProperties.java  
 * <b>Package Name:</b> com.sabs.springboot.bean  
 * <b>Date:</b> 2018年3月29日上午10:46:43  
 * Copyright (c) 2018, amazingb886@163.com All Rights Reserved.  
 *  
 */  
  
package com.sabs.springboot.bean;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**  
 * <b>ClassName:</b> BlogProperties  
 * <b>Function:</b> TODO ADD FUNCTION. <br/>  
 * <b>Reason:</b> TODO ADD REASON. <br/>   
 * @author   bo.dong  
 * @version    
 * @since    JDK 1.9 
 * @see        
 */
@Component
public class BlogProperties {
	@Value("${com.sabs.blog}")
	private String name;
	@Value("${com.sabs.blog.title}")
	private String title;
	/**  
	 * name.  
	 *  
	 * @return  the name  
	 * @throws UnsupportedEncodingException 
	 * @since   JDK 1.9 
	 */
	public String getName() throws UnsupportedEncodingException {
		System.out.println(name);
		byte[] name1 = name.getBytes("iso-8859-1");
		name = new String(name1, "utf-8");
		return name;
	}
	/**  
	 * name.  
	 *  
	 * @param   name   the name to set  
	 * @since   JDK 1.9 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**  
	 * title.  
	 *  
	 * @return  the title  
	 * @throws UnsupportedEncodingException 
	 * @since   JDK 1.9 
	 */
	public String getTitle() throws UnsupportedEncodingException {
		System.out.println(title);
		byte[] titlea = title.getBytes("iso-8859-1");
		title = new String(titlea, "utf-8");
		return title;
	}
	/**  
	 * title.  
	 *  
	 * @param   title   the title to set  
	 * @since   JDK 1.9 
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
  
