package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nikolay on 28.03.18.
 */
public class _22_Dialogs {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);


        JButton jButton = new JButton("show INFO dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(jPanel, "this is my dialog");
            }
        });


        JButton jButton2 = new JButton("show ERROR dialog");
        jPanel.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(jPanel, "this is my dialog", "title", JOptionPane.ERROR_MESSAGE);
            }
        });


        JButton jButton3 = new JButton("show QUESTION Y/N/C dialog");     // yes => в консоль 0
        jPanel.add(jButton3);                                       // no  => 1
        jButton3.addActionListener(new ActionListener() {           // cancel => 2
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showConfirmDialog(jPanel, "some message");
            }
        });


        JButton jButton4 = new JButton("show QUESTION Y/N dialog");
        jPanel.add(jButton4);
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showConfirmDialog(jPanel, "some message", "title", JOptionPane.YES_OPTION);
            }
        });


        JButton jButton5 = new JButton("show QUESTION OK/Cancel dialog");
        jPanel.add(jButton5);
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showConfirmDialog(jPanel, "some message", "title", JOptionPane.OK_CANCEL_OPTION);
            }
        });


        JButton jButton6 = new JButton("Option dialog");     // передаем на выбор свои варианты
        jPanel.add(jButton6);
        jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showOptionDialog(jPanel, "message", "title", 0, 0, null, new Object[]{"one", "two", "three"}, "two");
            }
        });


        JButton jButton7 = new JButton("Option dialog  с иконкой 'i'");     // передаем на выбор свои варианты
        jPanel.add(jButton7);
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showOptionDialog(jPanel, "message", "title", 0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"one", "two", "three"}, "two");
            }
        });


        JButton jButton8 = new JButton("Диалог с вводом данных");     // передаем на выбор свои варианты
        jPanel.add(jButton8);
        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                JOptionPane.showInputDialog(jPanel, "some message");
                System.out.println(JOptionPane.showInputDialog(jPanel, "some message")); // вывод в консоль введенных данных
            }
        });


        jPanel.revalidate();
    }
}
