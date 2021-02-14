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
    jf.setSize(500,500);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setVisible(true);
    jf.add(new Board());
}

}
class Board extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
    super.paintComponents(g);
    draw1(g);    
    }
    private void draw1(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.blue);
        int w = getWidth();
        int h = getHeight();
        g2d.drawLine(0,0,w,h);
        g2d.drawOval(w/2-50, h/2-50, 100, 100);
        g2d.drawRect(w-30, h-20, w/2, h/2);
      
    }
}


