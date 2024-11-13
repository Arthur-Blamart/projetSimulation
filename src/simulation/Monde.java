package simulation;

import java.util.ArrayList;

public class Monde {
    
    private ArrayList<Acteurs> habitants;



    public Monde(String[] args) {
        this.habitants = new ArrayList<Acteurs>();
    }

    public void ajouterHabitants(Acteurs nouvelHabitant){
        habitants.add(nouvelHabitant);
    }

}
