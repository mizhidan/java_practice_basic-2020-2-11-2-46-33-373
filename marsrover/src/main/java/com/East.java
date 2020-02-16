package com;

public class East extends Direction implements ChangeDirection {
    public East(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new East('S');
    }

    @Override
    public Direction turnRight() {
        return new East('N');
    }
}
