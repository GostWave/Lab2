package mymoves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Scratch extends PhysicalMove {
    public Scratch() {
        super(Type.NORMAL, 40, 100);
    }


    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует атаку " + pieces[pieces.length - 1];

    }
}
