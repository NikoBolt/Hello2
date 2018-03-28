package com.company.Swing.wrk;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
    private int frameHeight = 600;
    private int frameWidth = 1000;

    public myFrame() {
        sets();
    }

    private void sets(){
        // JFrame properties
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setBounds(dimension.width/4 - frameWidth/2,
                dimension.height/2 - frameHeight/2,
                frameWidth,
                frameHeight);

//        setSize(400, 400);
        setBackground(Color.BLACK);

        setTitle("this my app");
//        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public myFrame(int frameHeight, int frameWidth){
        setFrameHeight(frameHeight);
        setFrameWidth(frameWidth);
        sets();
    }


    public void setFrameHeight(int frameHeight) {
        this.frameHeight = frameHeight;
    }

    public void setFrameWidth(int frameWidth) {
        this.frameWidth = frameWidth;
    }
}
