package mypokemons;

import mymoves.PhysicalMoves.DoubleKick;
import mymoves.PhysicalMoves.Facade;
import mymoves.SpecialMoves.SludgeWave;
import mymoves.StatusMoves.Growl;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoqueen extends Pokemon {
    public Nidoqueen(String name, int level) {
        super(name, level);
        super.setType(Type.POISON, Type.GROUND);
        setStats(90, 92, 87, 75, 85, 76);

        DoubleKick doubleKick = new DoubleKick(30, 100, 0, 2);
        Facade facade = new Facade(70, 100);
        Growl growl = new Growl(0, 100);
        SludgeWave sludgeWave = new SludgeWave(95, 100);

        setMove(doubleKick, facade, growl, sludgeWave);
    }
}
