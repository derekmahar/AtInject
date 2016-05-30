package me.derekmahar.atinject.configuration;

import me.derekmahar.atinject.model.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	@Bean
	public A getA() {
		return new A();
	}
}
