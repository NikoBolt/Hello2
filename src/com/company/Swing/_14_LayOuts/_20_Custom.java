package com.company.Swing._14_LayOuts;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nikolay on 28.03.18.
 */
public class _20_Custom {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);


        jPanel.setLayout(new MyLayout());
        jPanel.add(new JButton("submit1"));
        jPanel.add(new JButton("submit2"));
        jPanel.add(new JButton("submit3"));


        jPanel.revalidate();
    }

    static class MyLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String s, Component component) {}
        @Override
        public void removeLayoutComponent(Component component) {}
        @Override
        public Dimension preferredLayoutSize(Container container) {return null;}
        @Override
        public Dimension minimumLayoutSize(Container container) {return null;}

        @Override
        public void layoutContainer(Container parent) {
            for (int i = 0; i < parent.getComponentCount(); i++) {
                Component component = parent.getComponent(i);
                component.setBounds(i*100, i*40, 100, 40);      // каждый компонент занимает по ширине 100 и высоте 40
                                                                // и сдвинут на то же расстояние
                                    // есть алгоритм растпределения по кругу или как угодно
            }
        }
    }
}
