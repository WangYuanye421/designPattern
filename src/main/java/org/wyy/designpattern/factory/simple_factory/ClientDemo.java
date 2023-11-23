package org.wyy.designpattern.factory.simple_factory;

import java.util.Calendar;
import java.util.Date;
import java.util.EnumSet;

/**
 * 模拟简单工厂客户端
 *
 * @author mars
 * @date 2023/11/23
 **/
public class ClientDemo {
    public static void main(String[] args) {
        Car car1 = SimpleFactoryDemo.getCar(CarTypeEnum.WuLing);
        Car car2 = SimpleFactoryDemo.getCar(CarTypeEnum.BYD);
        System.out.println(car1.getDescription());
        System.out.println(car2.getDescription());

        // JDK 使用场景
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());

        EnumSet<CarTypeEnum> enumSet = EnumSet.of(CarTypeEnum.WuLing, CarTypeEnum.BYD);
        System.out.println(enumSet.size());
    }


}
