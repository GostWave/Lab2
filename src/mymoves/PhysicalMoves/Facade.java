package mymoves.PhysicalMoves;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70,100);
    }
    private boolean f = false;

    @Override
    protected void 	applySelfEffects(Pokemon p){
        Status condition = p.getCondition();
        if (condition == Status.BURN | condition == Status.PARALYZE | condition == Status.POISON){
            f = true;
            this.power *= 2;
        }
    }
    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }
    @Override
    protected String describe(){
        if (f) return "горит, отравлен или парализован! Покемон использует атаку Facade с удвоенным уроном";
        else return "использует атаку Facade";
    }
}
