package Factory;

/**
 * Created by Asus on 2016/9/4.
 */
public class AnimalFactory {

    public static Animal getAnimal(String type){
        if("Cat".equals(type)){
            return new Cat();
        }else if("Dog".equals(type)){
            return new Dog();
        }
        return null;
    }
}
