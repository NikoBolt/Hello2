package com.company.AWT;

import com.company.AWT.wrk.myFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

/**
 * Created by Nikolay on 05.04.18.
 */
public class _02_Areas {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics graphics) {
            Graphics2D g2 = (Graphics2D)graphics;

            Area area = new Area(new Rectangle(0,0,100,100));   // Пустой квадрат
            g2.draw(area);

            Area area2 = new Area(new Rectangle(10,300,100,100));
            area2.add(new Area(new Ellipse2D.Double(60,350,150,150)));  // Добавление круга
            g2.fill(area2);                                             // Заливка области

            Area area3 = new Area(new Rectangle(200,10,100,100));
            area3.subtract(new Area(new Ellipse2D.Double(250,60,150,150))); // Вычитание области
            g2.fill(area3);

            Area area4 = new Area(new Rectangle(220,150,100,100));
            area4.intersect(new Area(new Ellipse2D.Double(270,200,150,150))); // Пересечение областей
            g2.fill(area4);

            Area area5 = new Area(new Rectangle(420,150,100,100));
            area5.exclusiveOr(new Area(new Ellipse2D.Double(470,200,150,150))); // Исключающее ИЛИ
            g2.fill(area5);
        }
    }
}
