package mymoves.PhysicalMoves;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class HeadButt extends PhysicalMove {
    public HeadButt() {
        super(Type.NORMAL, 70, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Program.chance(0.3)) {
            Effect.flinch(p);
        }

    }

    @Override
    protected String describe() {
        return "использует атаку HeadButt";

    }
}
