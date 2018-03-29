package com.company.AWT.wrk;

import javax.swing.*;

public class Blank {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);




        jPanel.revalidate();
    }
}
