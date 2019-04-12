package com.mateacademy.factory_method;

public class BuilderProduct {
    private final int reqFieldOne;
    private final int reqFieldTwo;
    private final int optFieldOne;
    private final int optFieldTwo;
    private final int optFieldThird;
    private final int optFieldFour;

    private BuilderProduct(Builder builder) {
        reqFieldOne = builder.reqFieldOne;
        reqFieldTwo = builder.reqFieldTwo;
        optFieldOne = builder.optFieldOne;
        optFieldTwo = builder.optFieldTwo;
        optFieldThird = builder.optFieldThird;
        optFieldFour = builder.optFieldFour;
    }

    public static class Builder implements  BuilderInterface{
        private final int reqFieldOne;
        private final int reqFieldTwo;
        private int optFieldOne = 0;
        private int optFieldTwo = 0;
        private int optFieldThird = 0;
        private int optFieldFour = 0;

        public Builder(int reqFieldOne, int reqFieldTwo) {
            this.reqFieldOne = reqFieldOne;
            this.reqFieldTwo = reqFieldTwo;
        }

        public Builder optFieldOne(int value) {
            optFieldOne = value;
            return this;
        }

        public Builder optFieldTwo(int value) {
            optFieldTwo = value;
            return this;
        }

        public Builder optFieldThird(int value) {
            optFieldThird = value;
            return this;
        }

        public Builder optFieldFour(int value) {
            optFieldFour = value;
            return this;
        }

        public BuilderProduct build() {
            return new BuilderProduct(this);
        }
    }
}
