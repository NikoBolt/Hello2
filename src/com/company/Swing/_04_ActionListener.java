package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _04_ActionListener {




//    class MyListener implements ActionListener {
//
//    }

    public static void main(String[] args) {
        JFrame jFrame = new myFrame();
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton = new JButton("submit");
//        jButton.setLocation(50,50);
        jButton.setBounds(150,100,300,200);
        jPanel.add(jButton);

        // для доступа к jFrame пишем анонимный класс
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jPanel.setBackground(Color.blue);
            }
//            public void
        });
    }
}
