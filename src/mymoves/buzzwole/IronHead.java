package mymoves.buzzwole;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class IronHead extends PhysicalMove {
    public IronHead(double pow, double acc){
        super(Type.STEEL, pow, acc);

    }


    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Program.chance(0.3)){
            Effect.flinch(p);
        }

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];

    }

}
