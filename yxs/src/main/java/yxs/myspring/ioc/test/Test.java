package yxs.myspring.ioc.test;

import yxs.myspring.ioc.bean.BeanFactory;
import yxs.myspring.ioc.config.parse.ClassPathXmlApplicationContext;
import yxs.myspring.ioc.object.A;
import yxs.myspring.ioc.object.B;

public class Test {
	// @org.junit.Test
	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("/yxs/myspring/ioc/conf/applicationContext.xml");
		A a = (A) bf.getBean("A");
		B b = (B) bf.getBean("B");
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(b.getA().getName());
	}
}
