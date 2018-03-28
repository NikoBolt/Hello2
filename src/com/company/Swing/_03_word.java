package com.company.Swing;

import com.company.Swing.wrk.myFrame;
import com.sun.org.apache.bcel.internal.generic.L2D;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class _03_word {

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {

            // write a words
            Font font = new Font("Bitstream Charter",Font.BOLD,50);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("hello world", 50,50);

            // draw a line
            Line2D l1 = new Line2D.Double(70,70,90,90);
            g2.draw(l1);

            // draw a line by points
            Point2D p1 = new Point2D.Double(110,110);
            Point2D p2 = new Point2D.Double(200,60);
            Line2D l2 = new Line2D.Double(p1,p2);
            g2.draw(l2);


            // draw a ellipse
            Ellipse2D el = new Ellipse2D.Double(80,120,60,30);
            g2.draw(el);

            // draw filled ellipse
            Ellipse2D el2 = new Ellipse2D.Double(150,120,60,90);
//            g2.draw(el2);
            g2.fill(el2);

            // draw painted ellipse
            Ellipse2D el3 = new Ellipse2D.Double(220,120,60,90);
            g2.setColor(new Color(12,15,60));
            g2.fill(el3);

            // draw red ellipse
            Ellipse2D el4 = new Ellipse2D.Double(290,120,60,90);
            g2.setColor(Color.red);
            g2.fill(el4);

            // draw red ellipse
            Ellipse2D el5 = new Ellipse2D.Double();
            el5.setFrameFromDiagonal(360,120,460,150);
            g2.setColor(Color.green);
            g2.draw(el5);


            // draw rectangle
            Rectangle2D r1 = new Rectangle2D.Double(50,250,100,50);
            g2.draw(r1);


            // draw image from file
            Image image2 = new ImageIcon("img/128.png").getImage();
            g2.drawImage(image2,400,330, null);

            // draw image from URL
//            URL url = null;
//            try {
//                url = new URL("https://im0-tub-ru.yandex.net/i?id=db99bbec908ccba7b58e416531892b6b&n=13");
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//            Image image = new ImageIcon(url).getImage();
//            g2.drawImage(image,50,330, null);



        }
    }


    public static void main(String[] args) {

        JFrame jFrame = new myFrame();
        jFrame.add(new MyComponent());



//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        for (String s: fonts) {
//            System.out.println(s);
//        }
        //Abyssinica SIL
        //Bitstream Charter
        //Century Schoolbook L
        //Courier 10 Pitch
        //DejaVu Sans
        //DejaVu Sans Condensed
        //DejaVu Sans Light
        //DejaVu Sans Mono
        //DejaVu Serif
        //DejaVu Serif Condensed
        //Dialog
        //DialogInput
        //Dingbats
        //FreeMono
        //FreeSans
        //FreeSerif
        //Garuda
        //KacstArt
        //KacstBook
        //KacstDecorative
        //KacstDigital
        //KacstFarsi
        //KacstLetter
        //KacstNaskh
        //KacstOffice
        //KacstOne
        //KacstPen
        //KacstPoster
        //KacstQurn
        //KacstScreen
        //KacstTitle
        //KacstTitleL
        //Khmer OS
        //Khmer OS System
        //Kinnari
        //Laksaman
        //Liberation Mono
        //Liberation Sans
        //Liberation Sans Narrow
        //Liberation Serif
        //LKLUG
        //Lohit Punjabi
        //Loma
        //Monospaced
        //mry_KacstQurn
        //NanumBarunGothic
        //NanumGothic
        //NanumMyeongjo
        //Nimbus Mono L
        //Nimbus Roman No9 L
        //Nimbus Sans L
        //Norasi
        //Noto Sans CJK JP Black
        //Noto Sans CJK JP Bold
        //Noto Sans CJK JP DemiLight
        //Noto Sans CJK JP Light
        //Noto Sans CJK JP Medium
        //Noto Sans CJK JP Regular
        //Noto Sans CJK JP Thin
        //Noto Sans CJK KR Black
        //Noto Sans CJK KR Bold
        //Noto Sans CJK KR DemiLight
        //Noto Sans CJK KR Light
        //Noto Sans CJK KR Medium
        //Noto Sans CJK KR Regular
        //Noto Sans CJK KR Thin
        //Noto Sans CJK SC Black
        //Noto Sans CJK SC Bold
        //Noto Sans CJK SC DemiLight
        //Noto Sans CJK SC Light
        //Noto Sans CJK SC Medium
        //Noto Sans CJK SC Regular
        //Noto Sans CJK SC Thin
        //Noto Sans CJK TC Black
        //Noto Sans CJK TC Bold
        //Noto Sans CJK TC DemiLight
        //Noto Sans CJK TC Light
        //Noto Sans CJK TC Medium
        //Noto Sans CJK TC Regular
        //Noto Sans CJK TC Thin
        //Noto Sans Mono CJK JP Bold
        //Noto Sans Mono CJK JP Regular
        //Noto Sans Mono CJK KR Bold
        //Noto Sans Mono CJK KR Regular
        //Noto Sans Mono CJK SC Bold
        //Noto Sans Mono CJK SC Regular
        //Noto Sans Mono CJK TC Bold
        //Noto Sans Mono CJK TC Regular
        //OpenSymbol
        //Padauk
        //Padauk Book
        //Phetsarath OT
        //Purisa
        //Saab
        //SansSerif
        //Sawasdee
        //Serif
        //Standard Symbols L
        //STIX
        //STIX Math
        //STIXGeneral
        //STIXIntegralsD
        //STIXIntegralsSm
        //STIXIntegralsUp
        //STIXIntegralsUpD
        //STIXIntegralsUpSm
        //STIXNonUnicode
        //STIXSizeFiveSym
        //STIXSizeFourSym
        //STIXSizeOneSym
        //STIXSizeThreeSym
        //STIXSizeTwoSym
        //STIXVariants
        //Symbola
        //TakaoPGothic
        //Tibetan Machine Uni
        //Tlwg Typist
        //Tlwg Typo
        //TlwgMono
        //TlwgTypewriter
        //Ubuntu
        //Ubuntu Condensed
        //Ubuntu Light
        //Ubuntu Mono
        //Umpush
        //URW Bookman L
        //URW Chancery L
        //URW Gothic L
        //URW Palladio L
        //Waree
    }

}
