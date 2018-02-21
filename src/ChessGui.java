import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ChessGui extends JFrame implements MouseListener, MouseMotionListener {

  private static final long serialVersionUID = 1L;

  JLayeredPane layeredPane;
  JPanel chessBoard;

  public ChessGui () {
    Dimension boardSize = new Dimension(600, 600);

    layeredPane = new JLayeredPane();
    getContentPane().add(layeredPane);
    layeredPane.setPreferredSize(boardSize);
    layeredPane.addMouseListener(this);
    layeredPane.addMouseMotionListener(this);

    chessBoard = new JPanel();
    layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
    chessBoard.setLayout(new GridLayout(8, 8));
    chessBoard.setPreferredSize(boardSize);
    chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);

    JPanel square = new JPanel(new BorderLayout());
    chessBoard.add(square);
    square.setBackground(Color.blue);
  }
}
