package exercices;

/**
 * Created by ciara on 16/11/2017.
 */
public class Exercice1 implements Runnable{
    String nom="Toto";
    int maxIter = 1000;
    int minIter = 0;
    Boolean count = true;
    public Exercice1(String  nom) {
        this.nom=nom;
    }

    public Exercice1(String nom, Boolean count) {
        this.nom = nom;
        this.count = count;
    }

    public void run() {
        System.out.format("Ici le  thread %s, je debute!\n", nom);
        if(this.count == true) {
            for (int i = minIter; i < maxIter; i++) {
                System.out.format("[%s] dit  je suis ici %d\n", nom, i);
            }
        } else {
            for (int i = maxIter; i > minIter; i--) {
                System.out.format("[%s] dit  je suis ici %d\n", nom, i);
            }
        }
        System.out.format("Ici le thread %s, je me termine!\n", nom);
    }
}
