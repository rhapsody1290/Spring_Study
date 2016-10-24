package proxy.dynamic;

import proxy.RealSubject;
import proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Asus on 2016/10/24.
 */
public class Client {
    public static void main(String[] args){

        //目标类
        RealSubject realSubject = new RealSubject();
        //调用处理处理程序
        InvocationHandler invocationHandler = new SubjectHandler(realSubject);
        /** 创建代理类的实例
         *  第一个参数表示代理类的类加载器
         *  第二个参数表示代理类所实现的接口列表
         *  第三个参数为调用处理程序类，可以是new Class[]{Subject.class}，
         *      也可以 RealSubject.class.getInterfaces()
         */
        Subject proxy = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{Subject.class},invocationHandler);
        proxy.request();
        proxy.no();
    }
}

class SubjectHandler implements InvocationHandler{
    //目标类的引用
    private Object target;

    public SubjectHandler(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName() != "no"){
            preHandler();
            Object o = method.invoke(target, args);
            postHandler();
        }else{
            Object o = method.invoke(target, args);
        }

        return null;
    }

    private void postHandler() {
        System.out.println("后置方法");
    }

    private void preHandler() {
        System.out.println("前置方法");
    }
}
