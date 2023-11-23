package org.wyy.designpattern.factory.simple_factory;

/**
 * 简单工厂类
 *
 * @author mars
 * @date 2023/11/23
 **/
public class SimpleFactoryDemo {

    public static Car getCar(CarTypeEnum carTypeEnum){
        // 枚举类中通过类型返回不同构造器
        return carTypeEnum.getConstructor().get();
    }

    // 常见用法
    public static Car getCar2(String type){
        switch (type) {
            case "wuling": return new WuLingCar();
            default: return null;
        }
    }
}
