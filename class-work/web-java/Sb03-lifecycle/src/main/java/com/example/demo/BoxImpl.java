package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BoxImpl implements Box , BeanNameAware , ApplicationContextAware , InitializingBean , DisposableBean {
	
	private int length;
	private int breadth;
	private int height;
	
	public BoxImpl() {
		
	}

	public BoxImpl(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	@Override
	public int calculateVolume() {
		
		return length * breadth * height;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the breadth
	 */
	public int getBreadth() {
		return breadth;
	}

	/**
	 * @param breadth the breadth to set
	 */
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "BoxImpl [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("4. ApplicationContextAware.setApplicationContext() called");
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("3. BeanNameAware.setBeanName() called with name: "+name);
		
	}

	@Override
	public void destroy() throws Exception {
		
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		
	}
	
	

}
