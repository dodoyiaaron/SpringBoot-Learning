/**  
 * <b>Project Name:</b> springDemo-1  
 * <b>File Name:</b> Test.java  
 * <b>Package Name:</b> com.sabs.springboot.bean  
 * <b>Date:</b> 2018年3月29日上午11:52:15  
 * Copyright (c) 2018, amazingb886@163.com All Rights Reserved.  
 *  
 */  
  
package com.sabs.springboot.bean;

import java.io.UnsupportedEncodingException;

/**  
 * <b>ClassName:</b> Test  
 * <b>Function:</b> TODO ADD FUNCTION. <br/>  
 * <b>Reason:</b> TODO ADD REASON. <br/>   
 * @author   bo.dong  
 * @version    
 * @since    JDK 1.9 
 * @see        
 */
public class Test {

	/**  
	 * <b>main<b>:(这里用一句话描述这个方法的作用).<br>
	 * @param args   
	 * @throws UnsupportedEncodingException 
	 * @Note 
	 * <b>author:</b>	bo.dong  
	 * <br><b>version:</b>	1.0
	 * <br><b>since:</b>	JDK 1.9 
	 * <br><b>Date:</b> 2018年3月29日 上午11:52:15
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String a = "Spring Bootå¥é¨";
		byte[] b = a.getBytes();
		
		a = new String(b, "utf-8");
		
		System.out.println(a);
		
	}

}
  
