package com.spring.SpringIocAop;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	/*@Resource和@Autowired的区别。@Resource默认是使用byName进行装配，@Autowired默认使用byType进行装配。*/
	
	@Value("lizi")
	private String name;
	
	@Resource
	private Teacher teacher;
	
	public String getName() {
		
		return this.name;
	}
	
	public Teacher getTeacher() {
		
		return this.teacher;
	}
}
