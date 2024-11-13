import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import simulation.*;

public class GUI {
    private JFrame mainFrame = new JFrame();
    private JPanel mainPanel = new JPanel();

    private int width = 700;
    private int height = 500;

    public GUI(){
        mainPanel.setBackground(Color.WHITE);
        mainFrame.add(mainPanel, BorderLayout.CENTER);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setTitle("Simulation");
        mainFrame.setSize(width, height);
        mainFrame.setVisible(true);
    }

    public void afficheMonde(Monde monde){
        ArrayList<Point> positions = monde.getPositions();
        Point current;
        for(int i=0 ; i<monde.getNombreHabitant() ; i++){
            current = positions.get(i);
            dessinerActeur(current.getX(), current.getY());
        }
    }

    public void dessinerActeur(double x, double y){
        mainPanel.drawRect(x/width, y/height, (double)2, (double)2);
    }
    
}
