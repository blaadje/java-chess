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
    Dimension boardSize = new Dimension(300, 300);

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

    JLabel piece = new JLabel(new ImageIcon("./icones/TB.gif"));
    JPanel panel = (JPanel)chessBoard.getComponent(0);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/CB.gif"));
    panel = (JPanel) chessBoard.getComponent(1);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/FB.gif"));
    panel = (JPanel) chessBoard.getComponent(2);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/RB.gif"));
    panel = (JPanel) chessBoard.getComponent(3);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/DB.gif"));
    panel = (JPanel) chessBoard.getComponent(4);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/FB.gif"));
    panel = (JPanel) chessBoard.getComponent(5);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/CB.gif"));
    panel = (JPanel) chessBoard.getComponent(6);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/TB.gif"));
    panel = (JPanel) chessBoard.getComponent(7);
    panel.add(piece);

    for (int i = 8 ; i < 16 ; i++) {
      piece = new JLabel(new ImageIcon("./icones/PB.gif"));
      panel = (JPanel) chessBoard.getComponent(i);
      panel.add(piece);
    }

    
    panel.add(piece);

    for (int i = 48; i < 56; i++) {
      piece = new JLabel(new ImageIcon("./icones/PN.gif"));
      panel = (JPanel) chessBoard.getComponent(i);
      panel.add(piece);
    }

    piece = new JLabel(new ImageIcon("./icones/TN.gif"));
    panel = (JPanel) chessBoard.getComponent(56);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/CN.gif"));
    panel = (JPanel) chessBoard.getComponent(57);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/FN.gif"));
    panel = (JPanel) chessBoard.getComponent(58);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/RN.gif"));
    panel = (JPanel) chessBoard.getComponent(59);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/DN.gif"));
    panel = (JPanel) chessBoard.getComponent(60);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/FN.gif"));
    panel = (JPanel) chessBoard.getComponent(61);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/CN.gif"));
    panel = (JPanel) chessBoard.getComponent(62);
    panel.add(piece);
    piece = new JLabel(new ImageIcon("./icones/TN.gif"));
    panel = (JPanel) chessBoard.getComponent(63);
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

    Component c = chessBoard.findComponentAt(e.getX(), e.getY());
    System.out.println(c);
    // c.setBackground(Color.white);
  }

  public void mouseEntered(MouseEvent e) {
    
  }

  public void mouseExited(MouseEvent e) {
    Component c = chessBoard.findComponentAt(e.getX(), e.getY());
    c.setBackground(Color.blue);
  }
}
