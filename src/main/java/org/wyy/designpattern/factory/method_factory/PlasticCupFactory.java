package org.wyy.designpattern.factory.method_factory;

/**
 * 熟料杯工厂
 *
 * @author mars
 * @date 2023/11/23
 **/
public class PlasticCupFactory implements AbstractFactory{
    @Override
    public Cup make() {
        return new PlasticCup();
    }
}
