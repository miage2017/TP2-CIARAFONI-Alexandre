import exercices.Exercice1;
import exercices.Exercice2;
import exercices.Exercice3;
import ressources.ObjetEntier;

/**
 * Created by ciara on 16/11/2017.
 */
public class Main {
    public static void main(String[] args)  throws  Exception {
        /********* EXO 1 *********/
/*
        String TAName = String.format("TAC", 0);
        Exercice1 TACount = new Exercice1(TAName);
        Thread TAC = new Thread(TACount);
        System.out.format("Creating thread %s\n", TAName);
        TAC.start();

        String TADName = String.format("TAD", 0);
        Exercice1 TADecount = new Exercice1(TADName, false);
        Thread TAD = new Thread(TADecount);
        System.out.format("Creating thread %s\n", TADName);
        TAD.start();
*/
        /********* FIN 1 *********/

        /********* EXO 2 *********/
/*
        String ThreadExo2 = String.format("TC", 0);
        Exercice2 TCount = new Exercice2(ThreadExo2, 1, 10);
        Thread TC = new Thread(TCount);
        System.out.format("Creating thread %s\n", ThreadExo2);
        TC.start();
 */
        /********* FIN 2 *********/

        /********* EXO 3 *********/
/*
        ObjetEntier notre_entier = new ObjetEntier();

        Exercice3 objex1 = new Exercice3(notre_entier, 1);
        Thread tache1 = new Thread(objex1 ,"incrementeur");
        tache1.start();
        tache1.join();
        Exercice3 objex2 = new Exercice3(notre_entier, -1);
        Thread tache2 = new Thread(objex2, "decrementeur");
        tache2.start();
*/
        /********* FIN 3 *********/

        /********* EXO 4 *********/
/*
        ObjetEntier notre_entier = new ObjetEntier();

        Exercice3 objex1 = new Exercice3(notre_entier, 1);
        Thread tache1 = new Thread(objex1 ,"incrementeur");
        tache1.start();

        Exercice3 objex2 = new Exercice3(notre_entier, -1);
        Thread tache2 = new Thread(objex2, "decrementeur");
        tache2.start();
*/
        /********* FIN 4 *********/

        /********* EXO 5 *********/



        /********* FIN 5 *********/
    }
}
