package com.company.Swing._14_LayOuts;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nikolay on 28.03.18.
 */
public class _17_Grid {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

            // элементы выстраиваются по сетке-таблице
        jPanel.setLayout(new GridLayout(2,2));
        jPanel.add(new JButton("one"));
        jPanel.add(new JButton("two"));
        jPanel.add(new JButton("three"));
        jPanel.add(new JButton("four"));


        jPanel.revalidate();
    }
}
