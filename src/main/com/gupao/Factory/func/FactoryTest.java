package main.com.gupao.Factory.func;

/**
 * Created by songpingping on 2018/3/4.
 */
public class FactoryTest {

    public static void main(String[] args) {
        Factory factory = new MengNiuFactory();

        //货比三家
        //不知道谁好谁坏
        //配置

        System.out.println(factory.getMilk());
    }
}
