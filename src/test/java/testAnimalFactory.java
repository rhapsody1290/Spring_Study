import Factory.Animal;
import Factory.AnimalFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Asus on 2016/9/4.
 */
public class testAnimalFactory {

    @Test
    public void testAnimalFactory() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Animal animal = context.getBean("dog", Animal.class);
        animal.sayHello();
    }
}
