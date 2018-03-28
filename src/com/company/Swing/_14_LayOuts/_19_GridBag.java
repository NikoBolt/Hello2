package com.company.Swing._14_LayOuts;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nikolay on 28.03.18.
 */
public class _19_GridBag {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

            // элементы по сетке,
            // но некоторые могут занимать несколько клеток
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        GridBagConstraints constraints1 = new GridBagConstraints();
                // хз что за координаты такие
//        constraints1.weightx=10; // координата в сетке по х
//        constraints1.weighty=10; // координата в сетке по у
        constraints1.gridx=0;   // с какой клетки начинаем рисовать
        constraints1.gridy=0;
        constraints1.gridwidth=2;  // сколько занимает клеток по ширине
        constraints1.gridheight=2;  // и высоте

        jPanel.add(new JTextArea(4,20),constraints1);    // добавляем текстовую область с координатами


        GridBagConstraints constraints2 = new GridBagConstraints();
//        constraints2.weightx=0;
//        constraints2.weighty=0;
        constraints2.gridx=2;
        constraints2.gridy=0;
        constraints2.gridwidth=2;
        constraints2.gridheight=1;

        jPanel.add(new JButton("sdf sdf dsfsdfsd fsdfsdf"),constraints2);


        GridBagConstraints constraints3 = new GridBagConstraints();
//        constraints3.weightx=0;
//        constraints3.weighty=0;
        constraints3.gridx=2;
        constraints3.gridy=1;
        constraints3.gridwidth=1;
        constraints3.gridheight=1;

        jPanel.add(new JButton("submit"),constraints3);


        GridBagConstraints constraints4 = new GridBagConstraints();
//        constraints4.weightx=10;
//        constraints4.weighty=0;
        constraints4.gridx=3;
        constraints4.gridy=1;
        constraints4.gridwidth=1;
        constraints4.gridheight=1;

        jPanel.add(new JButton("submit"),constraints4);


        jPanel.revalidate();
    }
}
