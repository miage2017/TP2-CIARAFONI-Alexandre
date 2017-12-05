package exercices;

import ressources.ObjetEntier;

/**
 * Created by ciara on 16/11/2017.
 */
public class Exercice3 implements Runnable {
    private ObjetEntier notre_entier;
    private int increment;

    public Exercice3(ObjetEntier notre_entier, int increment){
        this.increment = increment;
        this.notre_entier = notre_entier;
    }
    public void run() {
        for (int i = 0; i < 1e8; i++)
        {
            notre_entier.add(increment);
        }
        System.out.format("Thread faisant %d - termine, compteur = %s\n" , increment, notre_entier);
    }
}
