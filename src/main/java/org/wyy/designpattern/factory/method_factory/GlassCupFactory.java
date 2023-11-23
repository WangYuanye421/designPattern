package org.wyy.designpattern.factory.method_factory;

/**
 * 玻璃杯工厂
 *
 * @author mars
 * @date 2023/11/23
 **/
public class GlassCupFactory implements AbstractFactory{
    @Override
    public Cup make() {
        return new GlassCup();
    }
}
