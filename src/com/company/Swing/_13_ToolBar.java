package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;

public class _13_ToolBar {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame();
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);


        JToolBar jToolBar = new JToolBar("title"); // можно перетаскивать
        JButton one = new JButton("one");
        one.setToolTipText("first");        // при наведении на кнопку появляется подсказка

        JButton two = new JButton("two");
        jToolBar.add(one);
        jToolBar.add(two);

        JButton three = new JButton("three");   // разделительная полоса между кнопками
        jToolBar.addSeparator();
        jToolBar.add(three);

        jPanel.add(jToolBar);


        jPanel.revalidate();
    }
}
