package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nikolay on 29.03.18.
 */
public class _25_ColorDialog {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton = new JButton("show dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Color color = JColorChooser.showDialog(jPanel, "title", Color.blue);
                jPanel.setBackground(color);
            }
        });


        jPanel.revalidate();
    }
}
