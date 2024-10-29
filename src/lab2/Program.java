package lab2;

import mypokemons.Buzzwole;
import mypokemons.Drilbur;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {


//    https://pokemondb.net/pokedex/buzzwole



    public static void main(String[] args) {
        Battle b = new Battle();
        Drilbur p1 = new Drilbur("Drill",20);
        Buzzwole p2 = new Buzzwole("Покемончик", 20);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();


    }

    public static boolean chance(double d){
        return d > Math.random();

    }
}