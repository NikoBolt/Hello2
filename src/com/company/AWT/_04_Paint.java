package com.company.AWT;

import com.company.AWT.wrk.myFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImagingOpException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Nikolay on 05.04.18.
 */
public class _04_Paint {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics graphics) {


            Graphics2D g1 = (Graphics2D)graphics;
            Ellipse2D ellipse = new Ellipse2D.Double(0,0,200,100);
            g1.fill(ellipse);


            Graphics2D g2 = (Graphics2D)graphics;
            g2.setPaint(Color.red);
            Ellipse2D ellipse2 = new Ellipse2D.Double(50,50,200,100);
            g2.fill(ellipse2);

            Graphics2D g3 = (Graphics2D)graphics;
            g3.setPaint(new GradientPaint(new Point(100,100), Color.red, new Point(300,200),Color.yellow));
            Ellipse2D ellipse3 = new Ellipse2D.Double(100,100,200,100);
            g3.fill(ellipse3);

            Graphics2D g4 = (Graphics2D)graphics;
            try {
                g4.setPaint(new TexturePaint(ImageIO.read(new File("img/smile.png")), new Rectangle2D.Double(0,0,200,100)));
            }
            catch (ImagingOpException e){} catch (IOException e) {
                e.printStackTrace();
            }

            Ellipse2D ellipse4 = new Ellipse2D.Double(200,200,200,100);
            g4.fill(ellipse4);
        }
    }
}
