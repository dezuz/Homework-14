package com.mateacademy.factory_method;

public interface BuilderInterface {
    BuilderProduct.Builder optFieldOne(int value);

    BuilderProduct.Builder optFieldTwo(int value);

    BuilderProduct.Builder optFieldThird(int value);

    BuilderProduct.Builder optFieldFour(int value);

    BuilderProduct build();
}
