package com.mateacademy.factory_method;

public class ProxyProduct implements ProxyInterface{
    private Product product;

    public double add(double x, double y) {
        if(product == null) {
            product = new Product();
        }
        return product.add(x, y);
    }

    public double sub(double x, double y) {
        if(product == null) {
            product = new Product();
        }
        return product.sub(x, y);
    }

    public double mul(double x, double y) {
        if(product == null) {
            product = new Product();
        }
        return product.mul(x, y);
    }

    public double div(double x, double y) {
        if(product == null) {
            product = new Product();
        }
        return product.div(x, y);
    }
}
