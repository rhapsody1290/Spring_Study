package hello;

/**
 * Created by Asus on 2016/9/4.
 */
public class A {
    private B b;

    public void importantMethod(){
        System.out.println("A:importantMethod");
        b.usefulMethod();
    }
    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
