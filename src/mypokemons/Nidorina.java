package mypokemons;


import mymoves.PhysicalMoves.DoubleKick;
import mymoves.PhysicalMoves.Facade;
import mymoves.StatusMoves.Growl;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.*;


public class Nidorina extends Pokemon {
    public Nidorina(String name, int level) {
        super(name, level);
        super.setType(Type.POISON);
        setStats(70, 62, 67, 55, 55, 56);

        DoubleKick doubleKick = new DoubleKick(30,100,0,2);
        Facade facade = new Facade(70,100);
        Growl growl = new Growl(0,100);

        setMove(doubleKick, facade, growl);

    }

}
