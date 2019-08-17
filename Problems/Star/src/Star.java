// Flag starter kit
 
/*
 * Ethan Lin
 * Mihir Rao
 */
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JApplet;
 
public class Star extends JApplet {
    // init() will automatically be called when an applet is run
    public void init() {
        // Choice of width = 1.9 * height to start off
        // 760 : 400 is ratio of FLY : HOIST
        setSize(760, 400);
        repaint();
    }
 
    // paint() will be called every time a resizing of an applet occurs
    public void paint(Graphics g) {
        drawStars(g);
    }
 
    public void drawStars(Graphics g) {
    	Polygon p = new Polygon();
//    	p.addPoint(100, 150);
//    	p.addPoint(111, 115);
//    	p.addPoint(147, 115);
//    	p.addPoint(118, 94);
//    	p.addPoint(129, 59);
//    	p.addPoint(100, 80);
//    	p.addPoint(70, 59);
//    	p.addPoint(81, 94);
//    	p.addPoint(52, 115);
//    	p.addPoint(88, 115);
    	p.addPoint(100, 50);
    	p.addPoint(88, 84);
    	p.addPoint(52, 84);
    	p.addPoint(81, 105);
    	p.addPoint(70, 140);
    	p.addPoint(100, 119);
    	p.addPoint(129, 140);
    	p.addPoint(118, 105);
    	p.addPoint(147, 84);
    	p.addPoint(111, 84);
    	
    	g.drawPolygon(p);
    }
}