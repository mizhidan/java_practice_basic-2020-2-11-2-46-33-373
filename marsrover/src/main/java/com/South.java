package com;

public class South extends Direction implements ChangeDirection {

    public South(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new South('E');
    }

    @Override
    public Direction turnRight() {
        return new South('W');
    }

}
