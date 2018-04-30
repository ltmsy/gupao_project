package main.com.gupao.Factory;

/**
 * Created by songpingping on 2018/3/4.
 */
public class SimpleFactory {

    public Milk getMilk(String name){
        if("特仑苏".equalsIgnoreCase(name)){
            return new Telunsu();
        }else if("蒙牛".equalsIgnoreCase(name)){
            return new Mengniu();
        }else{
            System.out.println("无法创建");
            return null;
        }
    }
}
