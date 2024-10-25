package mymoves.buzzwole;


import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class ClearSmog extends SpecialMove {
    public ClearSmog(double pow, double acc){
        super(Type.POISON, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        p.restore();
    }

    @Override
    protected void applySelfEffects(Pokemon p ){
        super.applySelfEffects(p);

    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];

    }
}
