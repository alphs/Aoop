package Oop_Project.GameFramework.Game;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Board extends JFrame implements ChangeListener {

   private JFrame jframe;

    public Board() {
        jframe = new JFrame();
    }



    @Override
    public void stateChanged(ChangeEvent changeEvent) {

    }
}
