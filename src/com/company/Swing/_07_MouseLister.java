package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class _07_MouseLister {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame();
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);



//        jPanel.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent mouseEvent) {
//
//            }
//
//            @Override
//            public void mousePressed(MouseEvent mouseEvent) {
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent mouseEvent) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent mouseEvent) {
//
//            }
//
//            @Override
//            public void mouseExited(MouseEvent mouseEvent) {
//
//            }
//        });




//        jPanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent mouseEvent) {
//                super.mouseClicked(mouseEvent);
//                jPanel.setBackground(Color.blue);
//            }
//        });


        final JComponent jComponent = new MyComponent();
        jFrame.add(jComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                super.mouseMoved(mouseEvent);
                MyComponent.xCoord = mouseEvent.getX();
                MyComponent.yCoord = mouseEvent.getY();
                jComponent.repaint();
            }
        });
    }

    static class MyComponent extends JComponent {
        public static int xCoord;
        public static int yCoord;

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            ((Graphics2D)g).drawString("Coorfinates x: " + xCoord + " y:" + yCoord, 50,50);
        }
    }
}
