import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

import java.awt.geom.Line2D;
import java.awt.geom.Path2D;


public class Draw extends Canvas {

	
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
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