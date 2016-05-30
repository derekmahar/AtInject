package me.derekmahar.atinject.application;

import me.derekmahar.atinject.model.A;
import javax.inject.Inject;
import org.springframework.stereotype.Component;

@Component
public class Application {
	private final A a;

	@Inject
	public Application(A a) {
		this.a = a;
	}

	public A getA() {
		return a;
	}
}
