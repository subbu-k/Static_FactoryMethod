package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class C2 {

	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("resource/Spring1.xml");
		Test t=(Test)ap.getBean("t");
		System.out.println(t);
		Test t1=(Test)ap.getBean("t");
		System.out.println(t1);
		System.out.println(t==t1);
	
	}
}
