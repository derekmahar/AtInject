package me.derekmahar.atinject.start;

import me.derekmahar.atinject.application.Application;
import me.derekmahar.atinject.configuration.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
	public static void main(String[] arguments) {
		final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		final Application application = context.getBean(Application.class);
		application.getA();
	}
}
