package xml.bean;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/resource/xmlpeizhi.xml");
		
		Teacher teacher = (Teacher)context.getBean(Teacher.class);
		Student student = (Student)context.getBean(Student.class);
		
		System.out.println("teacher: " + teacher.getName());
		System.out.println("student: " + student.getName() + "; the teacher: " + student.getTeacher().getName());
	}

}
