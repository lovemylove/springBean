package xml.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TheThirdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (TheThird.class);
		Student student = (Student) context.getBean("student");
		Teacher teacher = (Teacher) context.getBean("teacher");
		System.out.println("学生的姓名：" + student.getName() + "; 老师是" + student.getTeacher().getName());
		System.out.println("老师的姓名：" + teacher.getName()); 
	}

}
