package exercices.exercice5;

import java.util.List;

/**
 * Created by ciara on 22/11/2017.
 */
public class ControleurPark {
    private List<Voiture> voitures;
    private final int maxPlaces = 40;

    public ControleurPark(List<Voiture> voitures)
    {
        this.voitures = voitures;
    }

    public boolean enter(Voiture voiture)
    {
        boolean autorise = false;
        if(voitures.size() < maxPlaces)
        {
            autorise = true;
            voitures.add(voiture);
        }
        return autorise;
    }

    public boolean leave(Voiture voiture)
    {
        boolean autorise = false;
        if(voitures.contains(voiture))
        {
            autorise = true;
            voitures.remove(voiture);
        }
        return autorise;
    }
}
