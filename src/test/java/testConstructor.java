import constructor.Product;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Asus on 2016/9/4.
 */
public class testConstructor {
    private ApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testConstructor() throws Exception {
        Product product = context.getBean("product", Product.class);
        System.out.println(product);
    }
}
