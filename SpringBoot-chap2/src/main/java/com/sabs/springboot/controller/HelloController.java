/**  
 * <b>Project Name:</b> springDemo-1  
 * <b>File Name:</b> HelloController.java  
 * <b>Package Name:</b> com.sabs.springboot.controller  
 * <b>Date:</b> 2018年3月29日上午10:19:48  
 * Copyright (c) 2018, amazingb886@163.com All Rights Reserved.  
 *  
 */  
  
package com.sabs.springboot.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**  
 * <b>ClassName:</b> HelloController  
 * <b>Function:</b> TODO ADD FUNCTION. <br/>  
 * <b>Reason:</b> TODO ADD REASON. <br/>   
 * @author   bo.dong  
 * @version    
 * @since    JDK 1.9 
 * @see        
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String index(ModelMap map) {
		// 加入一个属性，用来在模板中读取
		map.addAttribute("host", "http://blog.didispace.com");
		// return模板文件的名称，对应src/main/resources/templates/index.html
		return "index";
	}
}
  
