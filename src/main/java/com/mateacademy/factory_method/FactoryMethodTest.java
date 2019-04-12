package com.mateacademy.factory_method;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Creator[] creators = {new SingletonCreator(), new ProxyCreator(), new BuilderCreator()};
        for (Creator creator : creators) {
            creator.factoryMethod();
        }
    }
}
