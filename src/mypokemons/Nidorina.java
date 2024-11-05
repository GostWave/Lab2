package mypokemons;



import mymoves.StatusMoves.Growl;
import ru.ifmo.se.pokemon.Type;


public class Nidorina extends NidoranF {
    public Nidorina(String name, int level) {
        super(name, level);
        super.setType(Type.POISON);
        setStats(70, 62, 67, 55, 55, 56);


        addMove(new Growl());

    }

}
