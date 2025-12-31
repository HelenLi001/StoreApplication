package com.starter.store;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var resource = context.getBean(HeavyResource.class);
		var orderService = context.getBean(OrderService.class);
		var orderService2 = context.getBean(OrderService.class);
		orderService.placeOrder();
		context.close();
	} 
}
 