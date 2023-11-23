package org.wyy.designpattern.factory.method_factory;

/**
 * 抽象工厂,定义创建对象的方法
 * 工厂方法模式: 使用一个工厂接口定义创建对象的方法,所以叫工厂方法
 *
 * @author mars
 * @date 2023/11/23
 **/
public interface AbstractFactory {
    /**
     * 制作杯子
     * @return
     */
    Cup make();
}
