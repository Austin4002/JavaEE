package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("proxy��������");
		Object object = mi.proceed();
		System.out.println("proxy�ύ����");
		return object;
	}

}
