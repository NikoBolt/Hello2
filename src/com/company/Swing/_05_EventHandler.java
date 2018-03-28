package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class _05_EventHandler {
    public static void main(String[] args) {
        final JFrame jFrame = new myFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton = new JButton("submit");
        jButton.setBounds(150,100,300,200);
        jPanel.add(jButton);

        // замена 4 строк на одну
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jFrame.setTitle(((JButton)e.getSource()).getText());
//            }
//        });
        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "sourse.text"));

    }
}
