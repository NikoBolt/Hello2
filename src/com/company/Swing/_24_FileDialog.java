package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

/**
 * Created by Nikolay on 29.03.18.
 */
public class _24_FileDialog {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(600,800);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);


        JButton jButton = new JButton("show Open file dialog");     // открыть файл
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showOpenDialog(jPanel);
            }
        });


        JButton jButton2 = new JButton("show Save file dialog");       // сохранить файл
        jPanel.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showSaveDialog(jPanel);
            }
        });


        JButton jButton3 = new JButton("show myDialog");
        jPanel.add(jButton3);
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showDialog(jPanel, "save as");          // написать на кнопке
            }
        });


        JButton jButton4 = new JButton("show myDialog");
        jPanel.add(jButton4);
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File("c:/"));   // открыть директорию
                fileChooser.setSelectedFile(new File("Program files"));   // выбрать файлы
                fileChooser.showDialog(jPanel, "save as");
            }
        });


        JButton jButton5 = new JButton("show muli select dialog");
        jPanel.add(jButton5);
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();

                fileChooser.setMultiSelectionEnabled(true);         // выбор нескольких файлов с помощью +Ctrl
                fileChooser.showDialog(jPanel, "save as");
            }
        });


        JButton jButton6 = new JButton("show directory select dialog");
        jPanel.add(jButton6);
        jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();

                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // выбор только директорий
                fileChooser.showDialog(jPanel, "save as");
            }
        });


        JButton jButton7 = new JButton("show file filter dialog");
        jPanel.add(jButton7);
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();

                fileChooser.setFileFilter(new FileFilter() {
                    @Override
                    public boolean accept(File file) {
                        if(file.getName().endsWith(".gif")){       // выбор только gif
                            return true;
                        }
                        return false;
                    }

                    @Override
                    public String getDescription() {
                        return "only gif files";        // текст
                    }
                });
                fileChooser.showDialog(jPanel, "save as");
            }
        });


        JButton jButton8 = new JButton("show file filter dialog2");
        jPanel.add(jButton8);
        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();

//                fileChooser.setFileFilter(new FileFilter() {
//                    @Override
//                    public boolean accept(File file) {
//                        if(file.getName().endsWith(".gif")){       // выбор только gif
//                            return true;
//                        }
//                        return false;
//                    }
//
//                    @Override
//                    public String getDescription() {
//                        return "only gif files";        // текст
//                    }
//                });

                TextField textField = new TextField("sdfsdfsdf", 50);       // вывод текста в поле выбора
                fileChooser.add(textField);

                fileChooser.showDialog(jPanel, "save as");
            }
        });


        JButton jButton9 = new JButton("show file filter dialog3");
        jPanel.add(jButton9);
        jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();
                TextField textField = new TextField("sdfsdfsdf", 50);       // вывод текста в поле выбора
                fileChooser.add(textField, BorderLayout.SOUTH);             // внизу вместо кнопок

                fileChooser.showDialog(jPanel, "save as");
            }
        });


        JButton jButton10 = new JButton("show dialog with properties");
        jPanel.add(jButton10);
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();
                final TextField textField = new TextField("sdfsdfsdf", 50);
                fileChooser.add(textField, BorderLayout.SOUTH);

                    // каждый раз при выборе фаула запускается метод
                fileChooser.addPropertyChangeListener(new PropertyChangeListener() {
                    @Override
                    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
                        textField.setText(propertyChangeEvent.getPropertyName());
                    }
                });

                fileChooser.showDialog(jPanel, "save as");
            }
        });


        JButton jButton11 = new JButton("show pressed button in console");
        jPanel.add(jButton11);
        jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();


                int i = fileChooser.showDialog(jPanel, "save as");
                System.out.println(i);      // cancel -> 1, open -> 0

                File file = fileChooser.getSelectedFile();
                System.out.println(file.getName());
            }
        });


        JButton jButton12 = new JButton("show FileView");   // сделать собственный FileView
        jPanel.add(jButton12);
        jButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();


                fileChooser.setFileView(new FileView() {});     // сюда вставить


                int i = fileChooser.showDialog(jPanel, "save as");
                System.out.println(i);      // cancel -> 1, open -> 0

                File file = fileChooser.getSelectedFile();
                System.out.println(file.getName());
            }
        });


        jPanel.revalidate();
    }
}
