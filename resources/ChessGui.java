import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ChessGui extends JFrame implements MouseListener, MouseMotionListener {

  private static final long serialVersionUID = 1L;

  JLayeredPane layeredPane;
  JPanel chessBoard;
  JLabel chessPiece;
  int xAdjustment;
  int yAdjustment;

  public static int SIZE = 8;

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

   
    for (int i = 0; i < 64; i++) {
      JPanel square = new JPanel(new BorderLayout());
      chessBoard.add(square);

      int row = (i / 8) % 2;
      if (row == 0)
        square.setBackground(i % 2 == 0 ? Color.blue : Color.white);
      else
        square.setBackground(i % 2 == 0 ? Color.white : Color.blue);
    }

    JLabel piece = new JLabel(new ImageIcon("./icones/CB.gif"));
    JPanel panel = (JPanel)chessBoard.getComponent(0);
    panel.add(piece);
  }

  public void mousePressed(MouseEvent e) {
    chessPiece = null;
    Component c = chessBoard.findComponentAt(e.getX(), e.getY());

    if (c instanceof JPanel)
      return;

    Point parentLocation = c.getParent().getLocation();
    xAdjustment = parentLocation.x - e.getX();
    yAdjustment = parentLocation.y - e.getY();
    chessPiece = (JLabel) c;
    chessPiece.setLocation(e.getX() + xAdjustment, e.getY() + yAdjustment);
    chessPiece.setBackground(Color.blue);
    layeredPane.add(chessPiece, JLayeredPane.DRAG_LAYER);

    square.setBackground(Color.red);
  }
  
  public void mouseReleased(MouseEvent e) {
    if(chessPiece == null) return;
    chessPiece.setVisible(false);
    Component c =  chessBoard.findComponentAt(e.getX(), e.getY());
  
    if (c instanceof JLabel){
      Container parent = c.getParent();
      parent.remove(0);
      parent.add(chessPiece);
    }

    chessPiece.setVisible(true);
  }
  
  public void mouseDragged(MouseEvent me) {
    if (chessPiece == null)
      return;
    chessPiece.setLocation(me.getX() + xAdjustment, me.getY() + yAdjustment);
  }

  public void mouseClicked(MouseEvent e) {

  }

  public void mouseMoved(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {

  }

  public void mouseExited(MouseEvent e) {

  }
}
