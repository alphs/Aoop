package Oop_Project.GameFramework.Game;

import javax.swing.*;
import java.awt.*;

public class GObject extends JLabel {

    private Dimension dimension;
    private int layerPos;

    Dimension getDimension() {
        return this.dimension;
    }

    int getLayerPos() {
        return layerPos;
    }

    void setDimension(Dimension dimension, int layerPos) {
        this.dimension = dimension;
        this.layerPos = layerPos;
    }
}
