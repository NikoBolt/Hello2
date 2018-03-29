package com.company.Swing._14_LayOuts;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nikolay on 28.03.18.
 */
public class _16_Border {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

            // элементы распределяются по 5-ти позициям
        jFrame.add(new JButton("NORTH"), BorderLayout.NORTH);
        jFrame.add(new JButton("WEST"), BorderLayout.WEST);
        jFrame.add(new JButton("CENTER"), BorderLayout.CENTER);
        jFrame.add(new JButton("EAST"), BorderLayout.EAST);
        jFrame.add(new JButton("SOUTH"), BorderLayout.SOUTH);


        jPanel.revalidate();
    }
}
