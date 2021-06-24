package juego;

import bestias.Bestias;
import ejercito.Ejercito;
import heroe.Heroes;

public class Juego {
    private static Heroes[] ejHero;
    private static Bestias[] ejeBestia;

    public Juego() {
        ejHero = new Heroes[5];
        ejeBestia = new Bestias[4];
    }

    public static void batalla(List<Heroes> heroes, List<Bestias> bestias) {

        Heroes[] he = new Heroes[heroes.size()];
        he = heroes.toArray(he);

        Bestias[] be = new Bestias[bestias.size()];
        be = bestias.toArray(be);

        Ejercito[] conca = new Ejercito[he.length + be.length];

        int indiceHeroe = 0;
        int indiceBestia = 0;


        for(int i=0;i<heroes.size();i++){
            heroes.get(i).atacar(bestias.get(i));
        }

    }

    
}
