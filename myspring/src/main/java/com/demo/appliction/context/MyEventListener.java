package com.demo.appliction.context;

import org.springframework.context.ApplicationListener;

public class MyEventListener implements ApplicationListener<MyEvent> {
	@Override
	public void onApplicationEvent(MyEvent event) {
		event.print();
	}
}
