package app;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(startApplication = false)
class MyObjectTest {

	@Inject
	private MyObject myObject;

	@Test
	void shouldIntercept() {
		String string = myObject.testMe();
		assertEquals("interceptor", string);
	}
}
