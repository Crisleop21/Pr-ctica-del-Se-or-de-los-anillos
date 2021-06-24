package juego;

import bestias.Bestias;
import bestias.Orcos;
import heroe.Elfos;
import heroe.Heroes;
import heroe.Hobbits;
import bestias.Trasgo;
import ejercito.Ejercito;

public class Principal {
    public static void main (String args[]){
           
        Heroes h1 = new Heroes("Legolas", 150, 30);
        Heroes h2 = new Heroes("Frodo", 20, 10);

        Bestias b1 = new Bestias("Lurtz", 200, 60);
        
        Orcos or = new Orcos("Shagrat", 220, 50);
        
        Trasgo tr = new Trasgo("Uglúk", 120, 30);

        Trasgo tr1 = new Trasgo("Mauhúr", 100, 30);


        Juego.juego(ejercitoHeroes,ejercitoBestias);

    }
    
}
