/**  
 * <b>Project Name:</b> springDemo-1  
 * <b>File Name:</b> Test.java  
 * <b>Package Name:</b> com.sabs.springboot  
 * <b>Date:</b> 2018年3月29日上午8:34:33  
 * Copyright (c) 2018, amazingb886@163.com All Rights Reserved.  
 *  
 */  
  
package com.sabs.springboot;

import java.util.Map.Entry;

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
	 * @throws InterruptedException 
	 * @Note 
	 * <b>author:</b>	bo.dong  
	 * <br><b>version:</b>	1.0
	 * <br><b>since:</b>	JDK 1.9 
	 * <br><b>Date:</b> 2018年3月29日 上午8:34:33
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CacheMap<Object, Object> ch = CacheMap.getDefault();
		
		int a = 0;
		int b = 10;
		
		Object value = ch.put(a, b);
		long t0 = System.currentTimeMillis();
		Thread.sleep(20000);
		long t01 = System.currentTimeMillis();
		System.out.println(value + "===" + t0 + "---" + t01 + "===" + " " + (t01-t0));
		for (Entry<Object, Object> entry : ch.entrySet()) {
			System.out.println("key0= " + entry.getKey() + " and value0= "
				                 + entry.getValue());
		}
		int c = 1;
		int d = 9;
		ch.put(c, d);
		Thread.sleep(10011);
		
		for (Entry<Object, Object> entry : ch.entrySet()) {
			System.out.println("key1= " + entry.getKey() + " and value1= "
				                 + entry.getValue());
		}
		
		Thread.sleep(50000);
		
		for (Entry<Object, Object> entry : ch.entrySet()) {
			System.out.println("key2= " + entry.getKey() + " and value2= "
				                 + entry.getValue());
		}
		
		
	}

}
  
