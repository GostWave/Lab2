package mymoves.SpecialMoves;


import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast() {
        super(Type.FIGHTING, 120,70);
    }


    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);


        Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1).chance(0.1);
        p.addEffect(e);


    }


    protected String describe() {
        return "использует атаку FocusBlast";

    }
}
