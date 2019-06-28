package com.mateacademy.factorymethod;

public class BuilderCreator extends Creator {
    @Override
    public void factoryMethod() {
        BuilderProduct goodClass = new BuilderProduct.Builder(40, 20)
                .optFieldOne(2)
                .optFieldTwo(4)
                .optFieldThird(23)
                .optFieldFour(9)
                .build();
    }
}
