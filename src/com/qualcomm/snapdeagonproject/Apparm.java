package com.qualcomm.snapdeagonproject;

import java.applet.Applet;
import java.awt.*;

public class Apparm extends Applet {
    private Label label1,label2,label3,label4;
    int m,n;
    String s1,s2,s3;
    public void init(){
        label1 = new Label("The student record is as follows");
        add(label1);
        label2 = new Label("Name");
        label3 = new Label("Roll Number");
        label4 = new Label("Percentage");
        s1= getParameter("Name");
        s2= getParameter("Roll");
        s3 = getParameter("Percentage");
        add(label2);
        add(label3);
        add(label4);
    }
    public void paint(Graphics g){
        g.drawString(s1,520,100);
        g.drawString(s2,580,100);
        g.drawString(s3,650,100);

    }


}
