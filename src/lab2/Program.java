package lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {

//    https://pokemondb.net/pokedex/buzzwole



    public static void main(String[] args) {
        Battle b = new Battle();
        Drilbur p1 = new Drilbur("Drill",1);
        Buzzwole p2 = new Buzzwole("Buzz", 20);
        Excadrill p3 = new Excadrill("Ex",20);
        NidoranF p4 = new NidoranF("Nin",20);
        Nidorina p5 = new Nidorina("Nid",20);
        Nidoqueen p6 = new Nidoqueen("Queen",20);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);


        b.go();


    }

    public static boolean chance(double d){
        return d > Math.random();

    }
}