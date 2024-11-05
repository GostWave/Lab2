package mymoves.PhysicalMoves;


import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND, 60,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.SPEED,-1);
        p.addEffect(e);
    }
}
