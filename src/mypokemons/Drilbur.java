package mypokemons;

import mymoves.SpecialMoves.MudSlap;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Drilbur extends Pokemon{
    public Drilbur(String name, int level) {
        super(name, level);
        super.setType(Type.GROUND);
        super.setStats(60, 85, 40, 30, 45, 68);

        MudSlap mudSlap = new MudSlap(20,100);
        setMove(mudSlap);

    }
}
