package org.wyy.designpattern.factory.simple_factory;

/**
 * 比亚迪车
 *
 * @author mars
 * @date 2023/11/23
 **/
public class BydCar implements Car{
    @Override
    public String getDescription() {
        return "这是比亚迪车";
    }
}
