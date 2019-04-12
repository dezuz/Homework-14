package com.mateacademy.factory_method;

public class ProxyCreator extends Creator {
    @Override
    public void factoryMethod() {
        ProxyInterface proxyInterface = new ProxyProduct();

        System.out.println("4 + 2 = " + proxyInterface.add(4, 2));
        System.out.println("4 - 2 = " + proxyInterface.sub(4, 2));
        System.out.println("4 * 2 = " + proxyInterface.mul(4, 2));
        System.out.println("4 / 2 = " + proxyInterface.div(4, 2));
    }
}
