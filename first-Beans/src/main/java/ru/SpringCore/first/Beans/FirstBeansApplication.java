package ru.SpringCore.first.Beans;

import Config.AppConfig;
import model.Driver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FirstBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstBeansApplication.class, args);

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);

		Driver driver1 = context.getBean("driver1", Driver.class);
		driver1.startStatus();

		Driver driver2 = context.getBean("driver2", Driver.class);
		driver2.startStatus();

		Driver driver3 = context.getBean("driver3", Driver.class);
		driver3.startStatus();

		context.close();
	}
}