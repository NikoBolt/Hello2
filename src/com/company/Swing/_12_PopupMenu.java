package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _12_PopupMenu {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame();
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);


        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.add(new JMenuItem("one"));
        jPopupMenu.add(new JMenuItem("two"));
        jPanel.setComponentPopupMenu(jPopupMenu);

        JMenuItem exit = jPopupMenu.add(new JMenuItem("Exit3"));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });


        jPanel.revalidate();
    }
}