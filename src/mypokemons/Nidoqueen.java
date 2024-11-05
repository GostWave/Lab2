package mypokemons;

import mymoves.SpecialMoves.SludgeWave;
import ru.ifmo.se.pokemon.Type;

public final class Nidoqueen extends Nidorina {
    public Nidoqueen(String name, int level) {
        super(name, level);
        super.setType(Type.POISON, Type.GROUND);
        setStats(90, 92, 87, 75, 85, 76);

        addMove(new SludgeWave());
    }
}
