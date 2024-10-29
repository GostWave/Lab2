package mymoves.PhysicalMoves;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    private boolean flag = false;

    @Override
    protected void 	applySelfEffects(Pokemon p){
        Status condition = p.getCondition();
        if (condition == Status.BURN | condition == Status.PARALYZE | condition == Status.POISON){
            flag = true;
            this.power *= 2;
        }
    }
    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }
    @Override
    protected String describe(){
        if (flag) return "горит, отравлен или парализован! Покемон использует атаку Facade с удвоенным уроном";
        else return "использует атаку Facade";
    }
}
