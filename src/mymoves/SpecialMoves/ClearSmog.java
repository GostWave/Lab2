package mymoves.SpecialMoves;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class ClearSmog extends SpecialMove {
    public ClearSmog(){
        super(Type.POISON, 50, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        p.restore();
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }


    @Override
    protected String describe(){
        return "использует атаку ClearSmog";

    }
}
