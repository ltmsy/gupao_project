package main.com.gupao.Factory.func;

import main.com.gupao.Factory.Mengniu;
import main.com.gupao.Factory.Milk;

/**
 * Created by songpingping on 2018/3/4.
 */
public class MengNiuFactory implements Factory {

    public Milk getMilk() {
        return new Mengniu();
    }
}
