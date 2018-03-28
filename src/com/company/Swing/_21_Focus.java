package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;

/**
 * Created by Nikolay on 28.03.18.
 */
public class _21_Focus {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(150,350);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);


        jPanel.add(new JButton("submit1"));
        jPanel.add(new JButton("submit2")).setFocusable(false);     // никогда не бывает в фокусе при ТАБуляции
        jPanel.add(new JButton("submit3")).requestFocusInWindow();  // в фокусе по умолчанию


        jPanel.revalidate();
    }
}
