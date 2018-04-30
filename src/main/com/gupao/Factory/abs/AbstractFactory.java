package main.com.gupao.Factory.abs;

import com.song.gupao.test.spring.factory.project.Milk;
import main.com.gupao.Factory.Milk;

/**
 *
 * 抽象工厂 是 用户选工厂主入口
 * Created by songpingping on 2018/3/4.
 */
public abstract class AbstractFactory {

    //公共逻辑
    //方便于统一管理

    public abstract Milk getMengNiu();

    public abstract Milk getTelunsun();

    public abstract Milk getYili();
}
