// import Plateau;
import ChessGui;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        // Plateau p = new Plateau();
        JFrame frame = new ChessGui();
        frame.pack();
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class Joueur {
    private int pions = 8;
    private boolean color = white;
}
