package main.com.gupao.Factory.func;


import main.com.gupao.Factory.Milk;
import main.com.gupao.Factory.Telunsu;

/**
 * Created by songpingping on 2018/3/4.
 */
public class TelunsuFactory implements Factory {

    public Milk getMilk() {
        return new Telunsu();
    }
}
