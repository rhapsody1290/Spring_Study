package annotation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Asus on 2016/10/21.
 */
public class A {

    B b = new BImpl();

    public void say(){
        /**
         * 第一个参数：类加载器，动态加载类
         * 第二个参数：得到目标接口，动态生成一个加强类
         * 第三个参数：利用这个参数对类进行加强
         */
        B proxy= (B)Proxy.newProxyInstance(this.getClass().getClassLoader(), b.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //业务扩展的实现
                if("say".equals(method.getName())){
                    System.out.println("增加日志功能");
                    Object o = method.invoke(b,args);
                    System.out.println("方法结束后");
                    return o;
                }
                //其他方法不需要加强
                return method.invoke(b,args);
            }
        });
        proxy.say();
    }

    public static void main(String[] args){
        A a = new A();
        a.say();
    }

}
