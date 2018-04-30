package main.com.gupao.Factory.abs;

import com.song.gupao.test.spring.func.MengNiuFactory;

/**
 * Created by songpingping on 2018/3/4.
 */
public class AbstractFactoryTest {


    public static void main(String[] args) {
        MengNiuFactory mengNiuFactory = new MengNiuFactory();
        System.out.println(mengNiuFactory.getMilk());


        MilkFactory milkFactory = new MilkFactory();
        milkFactory.getMengNiu();
        System.out.println(milkFactory.getMengNiu());

    }
}
