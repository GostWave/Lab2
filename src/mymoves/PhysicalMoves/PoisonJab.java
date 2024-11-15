package mymoves.PhysicalMoves;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonJab extends PhysicalMove {
    public PoisonJab(){
        super(Type.POISON, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Program.chance(0.3)){
            Effect.poison(p);


        }
    }

    @Override
    protected String describe(){
        return "использует атаку PoisonJab";

    }
}
