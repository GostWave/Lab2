package mymoves.PhysicalMoves;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonJab extends PhysicalMove {
    public PoisonJab(double pow, double acc){
        super(Type.POISON, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Program.chance(0.3)){
            Effect.poison(p);


        }
    }

    @Override
    protected void applySelfEffects(Pokemon p ){
        super.applySelfEffects(p);

    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует атаку " + pieces[pieces.length-1];

    }
}
