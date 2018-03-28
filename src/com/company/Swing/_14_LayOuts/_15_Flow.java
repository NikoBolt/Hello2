package com.company.Swing._14_LayOuts;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;

/**
 * Created by Nikolay on 28.03.18.
 */
public class _15_Flow {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

                // все элементы выстраиваются в линию
        jPanel.add(new JButton("one"));
        jPanel.add(new JButton("two"));
        jPanel.add(new JButton("three"));


        jPanel.revalidate();
    }
}
