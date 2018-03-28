package com.company.Swing.wrk;

import javax.swing.*;
import java.awt.*;

public class Blank {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);




        jPanel.revalidate();
    }
}
