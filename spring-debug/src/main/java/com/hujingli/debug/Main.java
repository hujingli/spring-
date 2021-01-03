package com.hujingli.debug;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <a href="exphuhong@163.com">胡红</a>
 * @Date 2020 年 09 月 27 日
 * @Description
 * @since
 */
public class Main {

	public static void main(String[] args) {
		/*ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("applicationContext.xml");
		content.getBean("person");*/
		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}
}
