package com.mateacademy.flyweight;

import java.awt.Color;

public final class Context {
    public final int x;
    public final int y;
    public final Color color;

    public Context(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
