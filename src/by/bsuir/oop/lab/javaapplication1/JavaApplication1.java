/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.oop.lab.javaapplication1;

/**
 *
 * @author nikst
 */
import javax.swing.*;
import java.awt.*;
import by.bsuir.oop.lab.components.Board;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jf = new JFrame("For2D");
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setBackground(Color.DARK_GRAY);
        jf.setSize(sSize.height - 100, sSize.height - 100);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.add(new Board());
        jf.setResizable(false);
        //коммент
    }

}


