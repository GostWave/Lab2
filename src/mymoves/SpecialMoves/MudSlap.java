package mymoves.SpecialMoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class MudSlap extends SpecialMove {
    public MudSlap(double pow, double acc){
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.ACCURACY,-1);
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
