package AOP.AspectJ;

import org.aspectj.lang.JoinPoint;

/**
 * Created by Asus on 2016/10/24.
 */
public class MyAspect {
    public void before1(JoinPoint jointPoint){
        System.out.println("before1");
    }
    public void before2(JoinPoint jointPoint){
        System.out.println("before2");
    }
}
