package lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Program {





    public static void main(String[] args) {
        Battle b = new Battle();
        Drilbur p1 = new Drilbur("Dril",4);
        Buzzwole p2 = new Buzzwole("Buzz", 1);
        Excadrill p3 = new Excadrill("Ex",8);
        NidoranF p4 = new NidoranF("Nin",25);
        Nidorina p5 = new Nidorina("Nid",12);
        Nidoqueen p6 = new Nidoqueen("Queen",1);
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