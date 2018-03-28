package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _11_Menu {

    public static void main(String[] args) {
        JFrame jFrame = new myFrame();
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);



        JMenuBar jMenuBar = new JMenuBar();
        jFrame.setJMenuBar(jMenuBar);

        JMenu file = new JMenu("file");
//        JMenu file = new JMenu("file", new ImageIcon("путь к иконке"));  // добавление иконки
        JMenu edit = new JMenu("edit");
        jMenuBar.add(file);
        jMenuBar.add(edit);

        file.add(new JMenuItem("Open"));

        file.add(new JMenuItem("Open", 'O'));        // добавление мнемоники

        file.add(new JMenuItem("Save"));

        JMenuItem save = file.add(new JMenuItem("Save as"));
        save.setEnabled(false);             // сделать пункт меню недоступным


        file.addSeparator();


        file.add(new JMenuItem("Exit1"));

        file.add(new JMenuItem("Exit2")).addActionListener(new ActionListener() {    // добавление ActionListener
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        JMenuItem exit = file.add(new JMenuItem("Exit3"));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));      // добавление сочетания клавиш


        edit.add(new JMenuItem("Cut"));
        edit.add(new JMenuItem("Copy"));

        JMenu options = new JMenu("Options");
        edit.add(options);              // добавление меню с подменю
        options.add("one");
        options.add("two");

        edit.add(new JCheckBoxMenuItem("checkBox"));        // добавление checkBox

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem radioButtonMenuItem1 = new JRadioButtonMenuItem("Radio1"); // добавление radioButton
        JRadioButtonMenuItem radioButtonMenuItem2 = new JRadioButtonMenuItem("Radio2");
        buttonGroup.add(radioButtonMenuItem1);
        buttonGroup.add(radioButtonMenuItem2);
        edit.add(radioButtonMenuItem1);
        edit.add(radioButtonMenuItem2);


        jPanel.revalidate();
    }
}
