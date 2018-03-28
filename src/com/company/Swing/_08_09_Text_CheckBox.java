package com.company.Swing;

import com.company.Swing.wrk.myFrame;

import javax.swing.*;
import javax.swing.border.Border;

public class _08_09_Text_CheckBox  {
    public static void main(String[] args) {
        JFrame jFrame = new myFrame(800, 600);
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        jPanel.add(new JTextField(20)); // размер поля

        jPanel.add(new JTextField("defalt value",20)); // значение по умолчанию
        JTextField jTextField = new JTextField();

//        jTextField.addActionListener();
//        jTextField.setText();
//        jTextField.getText();

        JLabel jLabel = new JLabel("this is label");
        jPanel.add(jLabel);

//        jLabel.getText();
//        jLabel.setText();

        JPasswordField jPasswordField = new JPasswordField(20);
//        jPasswordField.setVisible(false); // не отображается на екране
        jPanel.add(jPasswordField);

        JTextArea jTextArea = new JTextArea(5,20);  // растягивается при вводе букв
        jPanel.add(jTextArea);

        JTextArea jTextArea2 = new JTextArea(5,20);
        jTextArea2.setLineWrap(true);    // перенос строки
        jPanel.add(jTextArea2);

        JTextArea jTextArea3 = new JTextArea(5,20);
        JScrollPane jScrollPane = new JScrollPane(jTextArea3);   // полоса крокрутки
        jPanel.add(jScrollPane);




        JCheckBox jCheckBox = new JCheckBox("check box label"); // chekbox
        jPanel.add(jCheckBox);

        JRadioButton jRadioButton1 = new JRadioButton("one");   // 2 radiobutton
        JRadioButton jRadioButton2 = new JRadioButton("two");
        jRadioButton2.setSelected(true);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);


        Border border = BorderFactory.createEtchedBorder();     // рамка вокруг всего с заголовком
        Border title = BorderFactory.createTitledBorder(border, "title");
        jPanel.setBorder(title);

        JComboBox<String> comboBox = new JComboBox();       // выпадающее меню
        comboBox.addItem("one");
        comboBox.addItem("two");
        comboBox.addItem("three");
        jPanel.add(comboBox);


        jPanel.revalidate();

    }
}
