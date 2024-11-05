package mypokemons;

import mymoves.PhysicalMoves.DoubleKick;
import mymoves.PhysicalMoves.Facade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NidoranF extends Pokemon {
    public NidoranF(String name, int level) {
        super(name, level);
        super.setType(Type.POISON);
        setStats(55, 47, 52, 40, 40, 41);

        DoubleKick doubleKick = new DoubleKick();
        Facade facade = new Facade();
        setMove(doubleKick, facade);
    }
}
