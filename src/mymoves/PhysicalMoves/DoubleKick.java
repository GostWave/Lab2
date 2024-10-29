package mymoves.PhysicalMoves;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DoubleKick extends PhysicalMove {
    public DoubleKick(double pow, double acc, int priority, int hits) {
        super(Type.FIGHTING, pow, acc);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует атаку " + pieces[pieces.length - 1];

    }
}
