package com.ssm.aop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestAop {
	public static void main(String[] args) {		
		//1.��ʼ��Spring���������������ļ�
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean-aop-order.xml");
		//2.ͨ��������ȡCourseʵ��
		Order order=(Order) ac.getBean("order");		
		//3.����add����
        order.add();		
	}
}
