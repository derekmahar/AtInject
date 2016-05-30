package me.derekmahar.atinject.configuration;

import me.derekmahar.atinject.model.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"me.derekmahar.atinject.application", "me.derekmahar.atinject.model"})
public class ApplicationConfiguration {
	@Bean
	public A getA() {
		return new A("A1");
	}
}
