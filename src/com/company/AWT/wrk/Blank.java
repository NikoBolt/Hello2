package com.company.AWT.wrk;

import javax.swing.*;
import java.awt.*;

public class Blank {
//    public static void main(String[] args) {
//        JFrame jFrame = new myFrame(600,800);
//        final JPanel jPanel = new JPanel();
//        jFrame.add(jPanel);
//
//        jPanel.revalidate();
//    }

    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics graphics) {
            Graphics2D g2 = (Graphics2D)graphics;


        }
    }
}