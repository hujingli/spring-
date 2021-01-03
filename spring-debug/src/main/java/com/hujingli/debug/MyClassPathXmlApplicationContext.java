package com.hujingli.debug;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {


	public MyClassPathXmlApplicationContext(String... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		getEnvironment().getSystemProperties().put("master", "huhong");
		getEnvironment().setRequiredProperties("master");
	}
}
