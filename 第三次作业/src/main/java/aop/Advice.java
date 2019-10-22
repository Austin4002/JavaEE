package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Advice {

	@Before(value="execution(public * service.ServiceImpl.insert(..))")
	public void before() {
		System.out.println("��������");
	}
	@After(value="execution(public * service.ServiceImpl.delete(..))")
	public void after() {
		System.out.println("�ύ����");
	}

	@Around(value="execution(public * service.ServiceImpl.update(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("��������");
		Object proceed = pjp.proceed();
		System.out.println("�ύ����");
		return proceed;
	}

	@AfterThrowing(value="execution(public * service.ServiceImpl.find(..))",throwing="ex")
	public void afterException(JoinPoint joinPoint,Throwable ex) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("�쳣֪ͨ���� "+methodName+" �������쳣Ϊ "+ex);
		System.out.println("����ع�");
	}
}
