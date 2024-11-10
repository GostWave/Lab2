package mymoves.SpecialMoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class SludgeWave extends SpecialMove {
    public SludgeWave() {
        super(Type.POISON, 95, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Program.chance(0.1)) {
            Effect.poison(p);

        }
    }
    @Override
    protected String describe() {
        return "использует атаку SludgeWave";

    }

}
