package com.company.Swing;

import javax.swing.*;
import java.awt.*;

public class _02_Frame {
    public static void main(String[] args) {
        int frameWidth = 500;
        int frameHeight = 300;

        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        jFrame.setSize(500, 500);
//        jFrame.setLocation(500, 400);

//        jFrame.setBounds(750,250,500,500);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/4 - frameWidth/2,
                dimension.height/2 - frameHeight/2,
                frameWidth,
                frameHeight);

        jFrame.setTitle("this my app");
    }
}
