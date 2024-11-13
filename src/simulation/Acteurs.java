package simulation;

public class Acteurs {
    private static int nombreActeurs = 0;

    private int id;

    private boolean vivant;
    //Ressources qui évolueront avec le temps/qui auraont besoin d'être maintenue
    private int sante;
    private int besoin;//Le besoin peut s'apparanter à la faim
    private int age;//L'age actuel de l'acteur

    //Attributs de naissances de l'acteurs
    private int santeBase;
    private int besoinMax;
    private int esperanceDeVie;

    public Acteurs(int santeBase, int besoinMax, int esperanceDeVie){
        nombreActeurs++;
        this.id = nombreActeurs;

        this.santeBase = santeBase;
        this.besoinMax = besoinMax;
        this.esperanceDeVie = esperanceDeVie;

        this.sante = santeBase;
        this.besoin = (int)(besoinMax*0.75);
        this.age = 1;
    }

    //La fonction tick permet de mettre à jour en fonction du temps passé
    public void tick(int uniteTemps){
        if(vivant){
            vieillir(uniteTemps);   
            affamer(uniteTemps);   
        }
    }

    public void vieillir(int uniteTemps){
        age += uniteTemps;
        if(age >= esperanceDeVie){
            mourir("Vieilliesse");
        }
    }
    public void affamer(int uniteNourriture){
        besoin -= uniteNourriture;
        if(besoin <= 0){
            mourir("Faim");
        }

    }

    public void manger(int uniteNourriture){
        besoin += uniteNourriture;
        if(besoin > besoinMax){
            besoin = besoinMax;
        }
    }

    public void mourir(String raison){
        vivant = false;
    }

}
