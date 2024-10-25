package mypokemons;


import mymoves.buzzwole.ClearSmog;
import mymoves.buzzwole.HeadButt;
import mymoves.buzzwole.PoisonJab;
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

        setMove(poisonJab,headButt,clearSmog);



    }

}
