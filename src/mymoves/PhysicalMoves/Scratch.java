package mymoves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Scratch extends PhysicalMove {
    public Scratch(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }


    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует атаку " + pieces[pieces.length - 1];

    }
}
