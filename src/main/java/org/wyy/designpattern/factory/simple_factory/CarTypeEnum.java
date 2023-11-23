package org.wyy.designpattern.factory.simple_factory;

import java.util.function.Supplier;

/**
 * 车类型枚举
 *
 * @author mars
 * @date 2023/11/23
 **/
public enum CarTypeEnum {
    WuLing(WuLingCar::new),
    BYD(BydCar::new);

    private Supplier<Car> constructor;

    CarTypeEnum(Supplier<Car> constructor){
        this.constructor = constructor;
    }

    public Supplier<Car> getConstructor(){
        return this.constructor;
    }
}
