package com.company.Swing._14_LayOuts;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;

/**
 * Created by Nikolay on 28.03.18.
 */
public class _18_NoLayout {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

            // пиксельная расстановка элементов
        jPanel.setLayout(null);
        JButton jButton = new JButton("submit");
        jButton.setBounds(50,80,150,50); // координаты: Х, У, ширина, высота
        jPanel.add(jButton);


        jPanel.revalidate();
    }
}
