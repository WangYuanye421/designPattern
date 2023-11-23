package org.wyy.designpattern.factory.method_factory;

/**
 * 模拟方法工厂客户端
 *
 * @author mars
 * @date 2023/11/23
 **/
public class MethodFactoryClientDemo {
    public static void main(String[] args) {
        // 制作玻璃杯
        AbstractFactory factory = new GlassCupFactory();
        // 杯子委托给具体的子类 创建
        Cup glassCup = factory.make();
        System.out.println(glassCup.getInfo());

        // 制作塑料杯  由调用方决定具体的使用工厂
        factory = new PlasticCupFactory();
        Cup plasticCup = factory.make();
        System.out.println(plasticCup.getInfo());
    }
}
