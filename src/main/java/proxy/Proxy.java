package proxy;

/**
 * Created by Asus on 2016/10/24.
 */
public class Proxy implements Subject{
    private RealSubject realSubject;
    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void no() {

    }

    private void postRequest() {
        System.out.println("记录时间");
    }

    private void preRequest() {
        System.out.println("日志记录");
    }
}
