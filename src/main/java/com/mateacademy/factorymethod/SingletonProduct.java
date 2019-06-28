package com.mateacademy.factorymethod;

public class SingletonProduct{
    private static SingletonProduct instance;

    private SingletonProduct(){
    }

    public static SingletonProduct getInstance(){
        if(instance == null){
            synchronized (SingletonProduct.class) {
                if(instance == null)
                instance = new SingletonProduct();
            }
        }
        return instance;
    }
}
