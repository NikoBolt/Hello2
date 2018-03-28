package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _06_tema_LookAndFeel {

    // разные стили для кнопок

    public static void main(String[] args) {

//        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
//        for(UIManager.LookAndFeelInfo lookAndFeelInfo: lookAndFeelInfos){
//            System.out.println(lookAndFeelInfo.getName());
//            System.out.println(lookAndFeelInfo.getClassName());
//        }
        // Metal
        //javax.swing.plaf.metal.MetalLookAndFeel
        //Nimbus
        //javax.swing.plaf.nimbus.NimbusLookAndFeel
        //CDE/Motif
        //com.sun.java.swing.plaf.motif.MotifLookAndFeel
        //GTK+
        //com.sun.java.swing.plaf.gtk.GTKLookAndFeel

        JFrame jFrame = new myFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton1 = new JButton("Metal");
        JButton jButton2 = new JButton("Nimbus");
        JButton jButton3 = new JButton("Motif");
        JButton jButton4 = new JButton("GTK");
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                }
                catch (Exception e) {

                }
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                }catch (Exception e) {

                }
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                }catch (Exception e) {

                }
            }
        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
                }catch (Exception e) {

                }
            }
        });
    }
}
