package proxy;

/**
 * Created by Asus on 2016/10/24.
 */
public class RealSubject implements Subject{
    public void request() {
        System.out.println("处理请求");
    }

    public void no() {
        System.out.println("不代理");
    }
}
