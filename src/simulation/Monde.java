package simulation;

import java.awt.Point;
import java.util.ArrayList;

public class Monde {
    
    private ArrayList<Acteurs> habitants;
    private ArrayList<Point> positions;

    private int nombreHabitant;

    public Monde(String[] args) {
        this.habitants = new ArrayList<Acteurs>();
        this.nombreHabitant = 0;
    }

    public void ajouterHabitants(Acteurs nouvelHabitant, int x, int y){
        habitants.add(nouvelHabitant);
        positions.add(new Point(x,y));

        nombreHabitant++;
    }

    public int getNombreHabitant(){
        return nombreHabitant;
    }

    public ArrayList<Acteurs> getHabitants(){
        return habitants;
    }

    public ArrayList<Point> getPositions(){
        return positions;
    }

}
