package com.mateacademy.factory_method;

public class SingletonCreator extends Creator{
    @Override
    public void factoryMethod() {
        SingletonProduct singletonProduct = SingletonProduct.getInstance();
        System.out.println(singletonProduct.hashCode());
    }
}
