package org.wyy.designpattern.factory.method_factory;

/**
 * 塑料杯
 *
 * @author mars
 * @date 2023/11/23
 **/
public class PlasticCup implements Cup{
    @Override
    public String getInfo() {
        return "这是塑料杯";
    }
}
