package com.ssm.aop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestAop {
	public static void main(String[] args) {		
		//1.初始化Spring容器，加载配置文件
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean-aop-order.xml");
		//2.通过容器获取Course实例
		Order order=(Order) ac.getBean("order");		
		//3.调用add方法
        order.add();		
	}
}
