package by.bsuir.oop.lab.shapes;


import java.awt.BasicStroke;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikst
 */
public class SunBeam {

        private double angle;
        private int baseX1;
        private int baseY1;
        private int baseX2;
        private int baseY2;
        private int baseX3;
        private int baseY3;
        private Graphics2D g2;

        public SunBeam(double a, int bx1, int by1, Graphics2D g2d) {
            angle = Math.toRadians(a);
            baseX1 = bx1;
            baseY1 = by1;
            g2 = g2d;
        }

        public void display(int w, int h) {
            float fw = w;
            float fh = h;
            float fbx1 = baseX1;
            float fby1 = baseY1;
            g2.setStroke(new BasicStroke(3.0f));
            double s = Math.sin(angle);
            double c = Math.cos(angle);
            float fs = (float) s;
            float fc = (float) c;
            baseX2 = Math.round(fc * fw / 400 + fbx1);
            baseY2 = Math.round(fs * fw / 400 + fby1);
            baseX3 = Math.round(fs * fw / 50 + fc * fw / 800 + fbx1);
            baseY3 = Math.round(-fc * fw / 50 - fs * fw / 800 + fby1);
            int x3[] = {baseX1, baseX2, baseX3, baseX1};
            int y3[] = {baseY1, baseY2, baseY3, baseY1};
            int numberofpoints = 4;
            g2.drawPolygon(x3, y3, numberofpoints);
        }
    }
