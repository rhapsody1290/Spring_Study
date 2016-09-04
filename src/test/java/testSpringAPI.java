import hello.A;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Asus on 2016/9/4.
 */
public class testSpringAPI {

    private ApplicationContext context;
    @Before
    public void setUp() throws Exception {
        //1.得到spring 的applicationContext对象(容器对象)
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testName() throws Exception {
        //2、利用java反射机制获取bean对象
        A a  = (A) context.getBean("A");
        a.importantMethod();
    }
}
