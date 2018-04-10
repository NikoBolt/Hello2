package com.company.AWT;

import com.company.AWT.wrk.myFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Nikolay on 05.04.18.
 */
public class _03_Stroke {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics graphics) {
            Graphics2D g2 = (Graphics2D)graphics;

            g2.setStroke(new BasicStroke(15f));

            Line2D line = new Line2D.Double(0,0,100,100);
            g2.draw(line);



            Graphics2D g3 = (Graphics2D)graphics;
            g3.setStroke(new BasicStroke(15f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));  // Закругленный конец
            Line2D line2 = new Line2D.Double(50,0,150,100);
            g3.draw(line2);


            Graphics2D g4 = (Graphics2D)graphics;
            g4.setStroke(new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 5f, new float[]{5,10}, 0));  // Пунктирная линия
            Line2D line3 = new Line2D.Double(100,0,200,100);
            g4.draw(line3);

            Graphics2D g5 = (Graphics2D)graphics;
            g5.setStroke(new BasicStroke(3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 5f, new float[]{5,10,20,30}, 0));  // Пунктирная линия
            Line2D line4 = new Line2D.Double(100,0,200,100);
            g5.draw(line4);
        }
    }
}
