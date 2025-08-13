package app;

import io.micronaut.context.annotation.Bean;
import test.TestAnnotation;

@TestAnnotation
@Bean
public class MyObject {
	public String testMe() {
		return "bean";
	}
}
