package xml.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TheThird {
	
	@Bean
	public Teacher teacher() {
		Teacher teacher = new Teacher();
		teacher.setName("zhanglaoshi");
		return teacher;
	}
	
	@Bean
	public Student student() {
		
		Student student = new Student();
		student.setName("litongxue");
		student.setTeacher(teacher());
		
		return student;
	}
	
}
