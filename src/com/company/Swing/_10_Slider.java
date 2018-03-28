package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;

public class _10_Slider {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame();
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JSlider jSlider1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
        jPanel.add(jSlider1);

        JSlider jSlider2 = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
        jPanel.add(jSlider2);
        jSlider2.setMinorTickSpacing(10);       // маленькие деления
        jSlider2.setMajorTickSpacing(20);       // большие деления
        jSlider2.setPaintTicks(true);


        JSlider jSlider3 = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
        jPanel.add(jSlider3);
        jSlider3.setMinorTickSpacing(10);
        jSlider3.setMajorTickSpacing(20);
        jSlider3.setPaintTicks(true);
        jSlider3.setSnapToTicks(true);          // курсор прыгает к ближайшему делению


        JSlider jSlider4 = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
        jPanel.add(jSlider4);
        jSlider4.setMinorTickSpacing(10);
        jSlider4.setMajorTickSpacing(20);
        jSlider4.setPaintTicks(true);
        jSlider4.setPaintLabels(true);      // подписывает цифры

        jPanel.revalidate();
    }

}
