package com.spring.SpringIocAop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("teacher")
public class Teacher {

	@Value("xiaoming")
	private String name;
	
	public String getName() {
		
		return name;
	}
}
