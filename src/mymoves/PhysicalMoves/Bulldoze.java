package mymoves.PhysicalMoves;

import mypokemons.Buzzwole;
import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(double pow, double acc) {
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.SPEED,-1);
        p.addEffect(e);
    }
}
