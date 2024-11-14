import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
public class GUIPanel extends JPanel{
    //Ecran
    final int originalTileSize = 16; //16x16 c'est les caractères dans tous les jeux vidéos (anciens)
    final int scale = 3; //Ici on le multiplie par 3 pour au moins voir un gugus. Mais il aura les mêmes proportions

    final int screenWidth = 1200;
    final int screenHeigt = 1000;

    public GUIPanel(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeigt));
        this.setBackground(new Color(0, 0, 255));
        this.setDoubleBuffered(true); //Rien compris mais en gros les objects sont "done" s'ils partent de l'écran (c'est pour les performances)
        
    }
}
