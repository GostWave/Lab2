package mypokemons;


import mymoves.SpecialMoves.FocusBlast;
import ru.ifmo.se.pokemon.Type;

public final class Excadrill extends Drilbur {
    public Excadrill(String name, int level) {
        super(name, level);
        super.setType(Type.GROUND, Type.STEEL);
        setStats(110, 135, 60, 50, 65, 88);
        addMove(new FocusBlast());


    }
}
