package com.company.AWT;

import com.company.AWT.wrk.myFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * Created by Nikolay on 29.03.18.
 */
public class _01_Shapes {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics graphics) {
            graphics.drawLine(0,0,100,100);     // простой способ рисования

            Graphics2D graphics2D = (Graphics2D) graphics;      // Линия по точкам
            Point2D point1 = new Point2D.Double(50,0);
            Point2D point2 = new Point2D.Double(100,50);
            Line2D line2D = new Line2D.Double(point1,point2);
            ((Graphics2D) graphics).draw(line2D);

            Rectangle2D rectangle2D = new Rectangle2D.Double(150, 10, 100, 50);     // Прямоугольник
            ((Graphics2D) graphics).draw(rectangle2D);

            RoundRectangle2D roundRectangle2D = new RoundRectangle2D.Double(300,30,100,50,20,20); // Прямоугольник с закругленными углами
            // 300, 30 - координаты угла; 100,50 - ширина и высота; 20,20 - координата ыентров закругления
            ((Graphics2D) graphics).draw(roundRectangle2D);

            Ellipse2D ellipse2D = new Ellipse2D.Double(450,10,100,50);  // Эллипс
            ((Graphics2D) graphics).draw(ellipse2D);

            QuadCurve2D quadCurve2D = new QuadCurve2D.Double(100, 200, 125,300,150,200); // изогнутая кривая - парабола
            ((Graphics2D) graphics).draw(quadCurve2D);      // 100,200 - координаты верхней левой точки
                                                            // 125,300 - координаты куда будет стремиться кривая
                                                            // 150,200 - конечная точка

            CubicCurve2D cubicCurve2D = new CubicCurve2D.Double(300,250, 375,350, 425,150, 500,250); // гипербола
            ((Graphics2D) graphics).draw(cubicCurve2D); // 300,250 - координаты верхней левой точки
                                                        // 375,350 - координаты 1й точки куда будет стремиться кривая
                                                        // 425,150 - координаты 2й тос=чки куда будет стремиться кривая
                                                        // 500,250 - конечная точка


            Arc2D arc2D1 = new Arc2D.Double(30,300,100,100,0,90,Arc2D.PIE);
            ((Graphics2D) graphics).draw(arc2D1);
            Arc2D arc2D4 = new Arc2D.Double(30,350,100,100,0,45,Arc2D.PIE);
            ((Graphics2D) graphics).draw(arc2D4);
            Arc2D arc2D5 = new Arc2D.Double(30,450,100,100,45,90,Arc2D.PIE);
            ((Graphics2D) graphics).draw(arc2D5);

            Arc2D arc2D2 = new Arc2D.Double(150,300,100,100,0,90,Arc2D.CHORD);
            ((Graphics2D) graphics).draw(arc2D2);

            Arc2D arc2D3 = new Arc2D.Double(300,300,100,100,0,90,Arc2D.OPEN);
            ((Graphics2D) graphics).draw(arc2D3);



            GeneralPath generalPath = new GeneralPath();
            generalPath.moveTo(200,475);        // Переместиться в точку
            generalPath.lineTo(300,450);        // Нарисовать линию
            generalPath.quadTo(400,550, 400,450);   // Дорисовать кривую
            generalPath.curveTo(450,500, 500,350, 550,450);     // Дорисовать гипербалу
            generalPath.closePath();    // Сделать закрытую фигуру - дорисовать прямую к началу
            ((Graphics2D) graphics).draw(generalPath);
        }
    }
}
