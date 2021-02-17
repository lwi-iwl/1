/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
/**
 *
 * @author nikst
 */
import javax.swing.*;
import java.awt.*;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args){
    JFrame jf = new JFrame ("For2D");
    Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();
    jf.setBackground(Color.DARK_GRAY);
    jf.setSize(sSize.height -100,sSize.height-100);
    jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    jf.setVisible(true);
    jf.add(new board());
    jf.setResizable(false);
    //коммент
}

}
class board extends JPanel{
private void draw1(Graphics g) {
Graphics2D g2d = (Graphics2D) g;
int w = getWidth();
int h = getHeight();
g2d.setPaint(Color.white);
g2d.setStroke(new BasicStroke(13.0f));
g2d.drawOval(w/5+w/24, h/5+h/8, w/19*10, w/19*10);
g2d.setStroke(new BasicStroke(10.0f));
g2d.drawLine(w/5, 4*h/5, 4*w/5, 4*h/5);
g2d.drawLine(w/5, 4*h/5, w/2, h/5);
g2d.drawLine(w/2, h/5, 4*w/5, 4*h/5);
g2d.drawOval(w/5-w/10+w/60, 4*h/5-w/60, w/10, w/10);
g2d.drawOval(w/5*4-w/60, 4*h/5-w/60, w/10, w/10);
g2d.drawOval(w/2-w/20, h/5-w/10, w/10, w/10);
g2d.setStroke(new BasicStroke(5.0f));
        int x[] = { w/2-w/50, w/2+w/50, w/2+w/45, w/2-w/45, w/2-w/50}; 
        int y[] = { 4*h/5-h/20, 4*h/5-h/20, 4*h/5-h/9, 4*h/5-h/9, 4*h/5-h/20}; 
        int numberofpoints = 5; 
g2d.drawPolygon(x, y, numberofpoints);

int x2[] = { w/2-w/43, w/2+w/43, w/2+w/35, w/2-w/35, w/2-w/43}; 
int y2[] = { 3*h/5+h/20, 3*h/5+h/20, h*2/5, h*2/5, 3*h/5}; 
numberofpoints = 5;
g2d.drawPolygon(x2, y2, numberofpoints);
g2d.drawArc(w/2-w/30, h/5-w/15, w/15, w/17, 30, 120);
g2d.drawArc(w/2-w/30, h/5-w/11, w/15, w/17, 210, 120);
g2d.drawOval(w/2-w/200, w*100/709, w/100, w/100);
g2d.drawArc(w/5*4, 4*h/5+w/90, w/24, w/24, 230, 210);
g2d.drawArc(w/5*4, 100*h/124, w/17, w/17, 210, 250);
g2d.drawOval(w*10/61, w*400/499, w/100, w/100);

SunBeam SB1 = new SunBeam(0, w/5-w/30,h*4/5+h/50, g2d);
        SB1.display();
SunBeam SB2 = new SunBeam(45.0, w/5-w/40,h*4/5+h/43, g2d);
        SB2.display();
SunBeam SB3 = new SunBeam(95.0, w/5-w/50,h*4/5+h/33, g2d);
        SB3.display();
SunBeam SB4 = new SunBeam(135.0, w/5-w/40,h*4/5+h/25, g2d);
        SB4.display();
SunBeam SB5 = new SunBeam(180.0, w/5-w/32,h*4/5+h/23, g2d);
        SB5.display();
SunBeam SB6 = new SunBeam(225.0, w/5-w/25,h*4/5+h/23, g2d);
        SB6.display();
SunBeam SB7 = new SunBeam(275.0, w/5-w/23,h*4/5+h/31, g2d);
        SB7.display();   
SunBeam SB8 = new SunBeam(315.0, w/5-w/25,h*4/5+h/43, g2d);
        SB8.display(); 
}

@Override
public void paintComponent(Graphics g) {
super.paintComponents(g);
draw1(g);
}

class SunBeam{
         
    double angle;
    int baseX1;
    int baseY1;
    int baseX2;
    int baseY2;
    int baseX3;
    int baseY3;
    Graphics2D g2;
    SunBeam(double a, int bx1, int by1, Graphics2D g2d)
    {
        angle = Math.toRadians(a);
        baseX1 = bx1;
        baseY1 = by1;
        g2 = g2d;
    }

    void display(){
    int w = getWidth();
    int h = getHeight();
    float fw = w;
    float fh = h;
    float fbx1 = baseX1;
    float fby1 = baseY1;
    g2.setStroke(new BasicStroke(3.0f));
double s = Math.sin(angle);
double c = Math.cos(angle);
float fs = (float) s;
float fc = (float) c;
baseX2 = Math.round(fc*fw/400+fbx1);
baseY2 = Math.round(fs*fw/400+fby1);
baseX3 = Math.round(fs*fw/50+fc*fw/800+fbx1);
baseY3 = Math.round(-fc*fw/50-fs*fw/800+fby1);
int x3[] = { baseX1, baseX2, baseX3, baseX1}; 
int y3[] = { baseY1, baseY2, baseY3, baseY1}; 
int numberofpoints = 4;
g2.drawPolygon(x3, y3, numberofpoints);   
    }
}
}





