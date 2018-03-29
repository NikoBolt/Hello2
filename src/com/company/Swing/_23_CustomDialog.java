package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nikolay on 29.03.18.
 */
public class _23_CustomDialog {
    static JFrame jFrame = new myFrame(600,800);

    public static void main(String[] args) {
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);


        JButton jButton = new JButton("show dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MyDialog myDialog = new MyDialog();
                myDialog.setVisible(true);
            }
        });


        jPanel.revalidate();
    }

    static class MyDialog extends JDialog {
        public MyDialog() {
            super(jFrame, "title", false);  // true/false = модальность - становится основным активным окном и переключаться на другое нельзя
            add(new JTextField(), BorderLayout.NORTH);
            add(new JButton("button"), BorderLayout.SOUTH);
            setBounds(300,300,200,100);
        }
    }
}
