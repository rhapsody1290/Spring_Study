package AOP.AspectJAnnotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Asus on 2016/10/24.
 */
@Component
@Aspect
//表示当前类是一个通知
public class MyAspect {

    @Before(value = "bean(aopServiceImpl)")
    public void before1(JoinPoint jointPoint){
        System.out.println("before1");
    }

    public void before2(JoinPoint jointPoint){
        System.out.println("before2");
    }
}
