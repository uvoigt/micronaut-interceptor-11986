package test;

import io.micronaut.aop.MethodInterceptor;
import io.micronaut.aop.MethodInvocationContext;
import io.micronaut.context.annotation.Prototype;

@Prototype
class TestInterceptor implements MethodInterceptor<Object, Object> {
	@Override
	public Object intercept(MethodInvocationContext<Object, Object> context) {
		return "interceptor";
	}
}
