package hello;

/**
 * Created by Asus on 2016/9/4.
 */
public class B {

    public void usefulMethod() {
        System.out.println("BImpl:usefulMethod");
    }

    public void shutdown() {
        System.out.println("BImpl:销毁前执行的一些方法" );
    }

    public void init() {
        System.out.println("BImpl:初始化方法");
    }
}
