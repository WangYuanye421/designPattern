package org.wyy.designpattern.factory.simple_factory;

/**
 * 五菱神车
 *
 * @author mars
 * @date 2023/11/23
 **/
public class WuLingCar implements Car{
    @Override
    public String getDescription() {
        return "这是五菱神车";
    }
}
