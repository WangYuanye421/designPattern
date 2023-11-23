package org.wyy.designpattern.factory.method_factory;

/**
 * @author mars
 * @date 2023/11/23
 **/
public class GlassCup implements Cup {

    @Override
    public String getInfo() {
        return "这是玻璃杯";
    }
}
