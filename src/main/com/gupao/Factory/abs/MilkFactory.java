package main.com.gupao.Factory.abs;

import main.com.gupao.Factory.Milk;
import main.com.gupao.Factory.func.MengNiuFactory;
import main.com.gupao.Factory.func.TelunsuFactory;
import main.com.gupao.Factory.func.YiliFactory;

/**
 * Created by songpingping on 2018/3/4.
 */
public class MilkFactory extends AbstractFactory {

    @Override
    public Milk getMengNiu() {
        return new MengNiuFactory().getMilk();
    }

    @Override
    public Milk getTelunsun() {
        return new TelunsuFactory().getMilk();
    }

    @Override
    public Milk getYili() {
        return new YiliFactory().getMilk();
    }
}
