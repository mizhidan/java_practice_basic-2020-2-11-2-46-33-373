package com;

public class West extends Direction implements ChangeDirection {
    public West(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new West('S');
    }

    @Override
    public Direction turnRight() {
        return new West('N');
    }
}
