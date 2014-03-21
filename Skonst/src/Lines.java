import java.awt.event.*;
import java.awt.*;

import javax.swing.*; 

public class Lines{

 public static void main(String[] args){
  java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(new DrawLine(150,300,350,300));
      frame.setSize(1024,768);
      frame.setVisible(true);  
    }
  });  
 } 
}

class DrawLine extends JPanel implements ActionListener{

  int x1;
  int y1;
  int x2;
  int y2;
  int midx;
  int midy;

  Timer time = new Timer(10, (ActionListener) this);

  public DrawLine(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    midx = (x1+x2)/2;
    midy = (y1+y2)/2;
    time.start();
  }

  public void animateLine(Graphics2D g){
	g.setStroke(new BasicStroke(6));
	g.setColor(Color.GREEN);
    g.drawLine(x1,y1,midx,midy);
    g.drawLine(x2,y2,midx,midy);
  }

  public void actionPerformed(ActionEvent arg0) {
    if(midy>123){
      midy--;
      repaint();
    }
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    
		Graphics2D g2 = (Graphics2D) g;
		animateLine(g2);
		g2.setBackground(Color.WHITE);
		g2.setStroke(new BasicStroke(6));
		g2.setColor(Color.GREEN);;
		g2.drawLine(401, 169, 413, 198);
		g2.drawLine(413,198,422,216);
		g2.drawLine(422,216,440,216);
		g2.drawLine(440,216,455,226);
		g2.drawLine(455,226,458,246);
		g2.drawLine(458,246,481,240);
		g2.drawLine(481,240,498,261);
		g2.drawLine(498,261,475,295);
		g2.drawLine(475,295,478,319);
		g2.drawLine(478,319,481,365);
		g2.drawLine(481,365,501,365);
		g2.drawLine(501,365,503,378);
		g2.drawLine(503,378,508,400);
		g2.drawLine(508,400,505,420);
		g2.drawLine(505,420,515,441);
		g2.drawLine(515,441,539,454);
		g2.drawLine(539,454,562,470);
		g2.drawLine(562,470,547,501);
		g2.drawLine(547,501,571,513);
		g2.drawLine(571,513,581,533);
		g2.drawLine(581,533,574,557);
		g2.drawLine(574,557,573,598);
		g2.drawLine(573,598,570,624);
		g2.drawLine(570,624,567,650);
		g2.drawLine(567,650,566,664);
		
	

  }
}
