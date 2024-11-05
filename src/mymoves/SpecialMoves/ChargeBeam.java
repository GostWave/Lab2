package mymoves.SpecialMoves;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(){
        super(Type.ELECTRIC, 50, 90);

    }



    @Override
    protected void applySelfEffects(Pokemon p ){
        super.applySelfEffects(p);
        if (Program.chance(0.7)) {
            Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует атаку " + pieces[pieces.length-1];

    }
}
