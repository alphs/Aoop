package Oop_Project.Sokoban;

import Oop_Project.GameFramework.Game.Board;
import static Oop_Project.GameFramework.Game.Board.createGUI;

public class Sokoban {

    public static void main(String[] args){
        Board board = new Board(0, 3);
        createGUI(board);
    }


}
