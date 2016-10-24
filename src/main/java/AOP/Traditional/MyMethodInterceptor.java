package AOP.Traditional;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Asus on 2016/10/24.
 */
public class MyMethodInterceptor implements MethodInterceptor{
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前");
        Object o = methodInvocation.proceed();
        System.out.println("环绕后");
        return o;
    }
}
