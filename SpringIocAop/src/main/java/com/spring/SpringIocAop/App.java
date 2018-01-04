package com.spring.SpringIocAop;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/resource/applicationContext.xml");
    	Student student = (Student)context.getBean(Student.class);
    	Teacher teacher = (Teacher)context.getBean(Teacher.class);
    	
    	System.out.println("teacher's name is: " + teacher.getName());
    	System.out.println("student's name is: " + student.getName() + "; and the teacher is: " + student.getTeacher().getName());
    }
}
