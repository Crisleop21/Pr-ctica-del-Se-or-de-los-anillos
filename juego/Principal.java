package juego;

import bestias.Orcos;
import heroe.Elfos;
import heroe.Heroes;
import heroe.Hobbits;
import bestias.Trasgo;

public class Principal {
    public static void main (String args[]){
        Heroes[] ejeHeroes = new Heroes[];
        

       
        List<Bestias> ejerBestias = new ArrayList<>();

        ejerHero.add(new Elfos("Legolas", 150, 30));
        
        ejerHero.add(new Hobbits("Frodo", 20, 10));

        ejerBestias.add(new Orcos("Lurtz", 200, 60));
        ejerBestias.add(new Orcos("Shagrat", 220, 50));
        ejerBestias.add(new Trasgo("Uglúk", 120, 30));
        ejerBestias.add(new Trasgo("Mauhúr", 100, 30));

        Juego.juego(ejerHero, ejerBestias);

    }
    
}
