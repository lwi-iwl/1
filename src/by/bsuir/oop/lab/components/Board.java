package by.bsuir.oop.lab.components;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import by.bsuir.oop.lab.shapes.SunBeam;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikst
 */
public class Board extends JPanel {

    private void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        g2d.setPaint(Color.white);
        g2d.setStroke(new BasicStroke(13.0f));
        g2d.drawOval(w / 5 + w / 24, h / 5 + h / 8, w / 19 * 10, w / 19 * 10);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.drawLine(w / 5, 4 * h / 5, 4 * w / 5, 4 * h / 5);
        g2d.drawLine(w / 5, 4 * h / 5, w / 2, h / 5);
        g2d.drawLine(w / 2, h / 5, 4 * w / 5, 4 * h / 5);
        g2d.drawOval(w / 5 - w / 10 + w / 60, 4 * h / 5 - w / 60, w / 10, w / 10);
        g2d.drawOval(w / 5 * 4 - w / 60, 4 * h / 5 - w / 60, w / 10, w / 10);
        g2d.drawOval(w / 2 - w / 20, h / 5 - w / 10, w / 10, w / 10);
        g2d.setStroke(new BasicStroke(5.0f));
        int x[] = {w / 2 - w / 50, w / 2 + w / 50, w / 2 + w / 45, w / 2 - w / 45, w / 2 - w / 50};
        int y[] = {4 * h / 5 - h / 20, 4 * h / 5 - h / 20, 4 * h / 5 - h / 9, 4 * h / 5 - h / 9, 4 * h / 5 - h / 20};
        int numberofpoints = 5;
        g2d.drawPolygon(x, y, numberofpoints);

        int x2[] = {w / 2 - w / 43, w / 2 + w / 43, w / 2 + w / 35, w / 2 - w / 35, w / 2 - w / 43};
        int y2[] = {3 * h / 5 + h / 20, 3 * h / 5 + h / 20, h * 2 / 5, h * 2 / 5, 3 * h / 5};
        numberofpoints = 5;
        g2d.drawPolygon(x2, y2, numberofpoints);
        g2d.drawArc(w / 2 - w / 30, h / 5 - w / 15, w / 15, w / 17, 30, 120);
        g2d.drawArc(w / 2 - w / 30, h / 5 - w / 11, w / 15, w / 17, 210, 120);
        g2d.drawOval(w / 2 - w / 200, w * 100 / 709, w / 100, w / 100);
        g2d.drawArc(w / 5 * 4, 4 * h / 5 + w / 90, w / 24, w / 24, 230, 210);
        g2d.drawArc(w / 5 * 4, 100 * h / 124, w / 17, w / 17, 210, 250);
        g2d.drawOval(w * 10 / 61, w * 400 / 499, w / 100, w / 100);

        SunBeam SB1 = new SunBeam(0, w / 5 - w / 30, h * 4 / 5 + h / 50, g2d);
        SB1.display(w, h);
        SunBeam SB2 = new SunBeam(45.0, w / 5 - w / 40, h * 4 / 5 + h / 43, g2d);
        SB2.display(w, h);
        SunBeam SB3 = new SunBeam(95.0, w / 5 - w / 50, h * 4 / 5 + h / 33, g2d);
        SB3.display(w, h);
        SunBeam SB4 = new SunBeam(135.0, w / 5 - w / 40, h * 4 / 5 + h / 25, g2d);
        SB4.display(w, h);
        SunBeam SB5 = new SunBeam(180.0, w / 5 - w / 32, h * 4 / 5 + h / 23, g2d);
        SB5.display(w, h);
        SunBeam SB6 = new SunBeam(225.0, w / 5 - w / 25, h * 4 / 5 + h / 23, g2d);
        SB6.display(w, h);
        SunBeam SB7 = new SunBeam(275.0, w / 5 - w / 23, h * 4 / 5 + h / 31, g2d);
        SB7.display(w, h);
        SunBeam SB8 = new SunBeam(315.0, w / 5 - w / 25, h * 4 / 5 + h / 43, g2d);
        SB8.display(w, h);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        draw(g);
    }

    
}