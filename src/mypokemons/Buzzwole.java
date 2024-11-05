package mypokemons;


import mymoves.SpecialMoves.ChargeBeam;
import mymoves.SpecialMoves.ClearSmog;
import mymoves.PhysicalMoves.HeadButt;
import mymoves.PhysicalMoves.PoisonJab;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Buzzwole extends Pokemon {
    public Buzzwole(String name, int level){
        super(name,level);
        super.setType(Type.BUG,Type.FIGHTING);
        super.setStats(107,139,139,53,53,79);

        HeadButt headButt = new HeadButt();
        ClearSmog clearSmog = new ClearSmog();
        PoisonJab poisonJab = new PoisonJab();
        ChargeBeam chargeBeam = new ChargeBeam();
        setMove(poisonJab,headButt,clearSmog,chargeBeam);



    }

}
