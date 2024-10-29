package mypokemons;

import mymoves.PhysicalMoves.Bulldoze;
import mymoves.PhysicalMoves.Scratch;
import mymoves.SpecialMoves.FocusBlast;
import mymoves.SpecialMoves.MudSlap;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Excadrill extends Pokemon {
    public Excadrill(String name, int level) {
        super(name, level);
        super.setType(Type.GROUND, Type.STEEL);
        setStats(110, 135, 60, 50, 65, 88);

        MudSlap mudSlap = new MudSlap(20, 100);
        Scratch scratch = new Scratch(40, 100);
        Bulldoze bulldoze = new Bulldoze(60, 100);
        FocusBlast focusBlast = new FocusBlast(120, 70);
        setMove(mudSlap, scratch, bulldoze, focusBlast);
    }
}
