package proxy;

/**
 * Created by Asus on 2016/10/24.
 */
public class Run {
    public static void main(String[] args){
        RealSubject realSubject = new RealSubject();
        Subject proxy = new Proxy(realSubject);
        proxy.request();
    }
}
