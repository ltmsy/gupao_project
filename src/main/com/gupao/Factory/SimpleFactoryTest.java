package main.com.gupao.Factory;

/**
 * Created by songpingping on 2018/3/4.
 */
public class SimpleFactoryTest {


    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Milk milk = simpleFactory.getMilk("蒙牛");
        System.out.println("产出:"+milk.getName());

    }
}
