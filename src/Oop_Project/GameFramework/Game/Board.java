package Oop_Project.GameFramework.Game;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Board extends JPanel implements ChangeListener {

    private final JLayeredPane layeredPane;
    private GObject[][] gameObjectives;
    
    public Board(int rows, int cols) {

        layeredPane = new JLayeredPane();
        layeredPane.setLayout(new GridLayout(rows, cols));
        layeredPane.setPreferredSize(gameObjectives[0][0].getDimension());

        layeredPane.add(new JButton("1"));
        layeredPane.add(new JButton("2"));
        layeredPane.add(new JButton("3"));
        layeredPane.add(new JButton("4"));
        layeredPane.add(new JButton("5"));
        layeredPane.add(new JButton("6"));
        layeredPane.add(new JButton("7"));
        layeredPane.add(new JButton("8"));
        layeredPane.add(new JButton("9"));
        layeredPane.add(new JButton("10"));
        layeredPane.add(new JButton("11"));
        layeredPane.add(new JButton("12"));
        layeredPane.add(new JButton("13"));
        layeredPane.add(new JButton("14"));
        layeredPane.add(new JButton("15"));
        layeredPane.add(new JButton("16"));
        layeredPane.add(new JButton("17"));
        add(layeredPane);

    }

    public void addGObjective(GObject go){
        layeredPane.add(go, go.getLayerPos());
    }


    /**
     * Creates and setups the GUI.  
     */
    public static void createGUI(Board b) {
        createGUI(b, "");
    }

    /**
     * Creates and setups the GUI.
     * @param board game board used in the GUI.
     * @param gameName  title of window.
     */
    public static void createGUI(Board board, String gameName){
        //Create and setup window
        JFrame frame = new JFrame(gameName);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add board to window
        frame.add(board);

        //Show window
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        //TODO: update stuff
    }
}
