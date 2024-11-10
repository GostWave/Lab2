package mymoves.SpecialMoves;


import ru.ifmo.se.pokemon.*;

public class MudSlap extends SpecialMove {
    public MudSlap() {
        super(Type.GROUND, 20, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.ACCURACY, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует атаку Mud-Slap";

    }
}
