package main.com.gupao.Factory.func;

import main.com.gupao.Factory.Milk;
import main.com.gupao.Factory.Yili;

/**
 * Created by songpingping on 2018/3/4.
 */
public class YiliFactory implements Factory {

    public Milk getMilk() {
        return new Yili();
    }
}
