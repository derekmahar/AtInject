package me.derekmahar.atinject.application;

import me.derekmahar.atinject.configuration.ApplicationConfiguration;
import me.derekmahar.atinject.model.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
	public static void main(String[] arguments) {
		final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		final Application application = context.getBean(Application.class);
		final A a1 = application.getA();
		System.out.println("Name of a1 is \"" + a1.getName() + "\".");
	}
}
