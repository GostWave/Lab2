package mypokemons;


import mymoves.buzzwole.HeadButt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Buzzwole extends Pokemon {
    public Buzzwole(String name, int level){
        super(name,level);
        super.setType(Type.BUG,Type.FIGHTING);
        super.setStats(107,139,139,53,53,79);

        HeadButt headButt = new HeadButt(80,100);

        setMove(headButt);


    }

}
