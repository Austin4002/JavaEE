package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("proxy开启事务");
		Object object = mi.proceed();
		System.out.println("proxy提交事务");
		return object;
	}

}
