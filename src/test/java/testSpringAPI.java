import hello.A;
import hello.B;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

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
    public void testApplication() throws Exception {
        //2、利用java反射机制获取bean对象
        A a = context.getBean("a",A.class);
        a.importantMethod();
    }

    @Test
    public void testBeanFactory(){

    }
}
