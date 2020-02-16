package com;

public class North extends Direction implements ChangeDirection {

    public North(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new North('W');
    }

    @Override
    public Direction turnRight() {
        return new North('E');
    }
}
