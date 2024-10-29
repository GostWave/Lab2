package mymoves.StatusMoves;


import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {
    public Growl(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.ATTACK,-1);
        p.addEffect(e);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует атаку " + pieces[pieces.length - 1];

    }
}
