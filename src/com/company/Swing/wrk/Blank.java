package com.company.Swing.wrk;

import javax.swing.*;

public class Blank {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame();
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);





        jPanel.revalidate();
    }
}
