package mypokemons;


import mymoves.SpecialMoves.ChargeBeam;
import mymoves.SpecialMoves.ClearSmog;
import mymoves.PhysicalMoves.HeadButt;
import mymoves.PhysicalMoves.PoisonJab;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Buzzwole extends Pokemon {
    public Buzzwole(String name, int level){
        super(name,level);
        super.setType(Type.BUG,Type.FIGHTING);
        super.setStats(107,139,139,53,53,79);

        HeadButt headButt = new HeadButt(80,100);
        ClearSmog clearSmog = new ClearSmog(50,0);
        PoisonJab poisonJab = new PoisonJab(80,100);
        ChargeBeam chargeBeam = new ChargeBeam(50,90);
        setMove(poisonJab,headButt,clearSmog);



    }

}
