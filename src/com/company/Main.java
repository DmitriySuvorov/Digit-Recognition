package com.company;
import com.company.GUI.StartWindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("StartWindow");
        frame.setContentPane(new StartWindow().panelMain);
        //frame.SetContentPane(new StartWindow().SrcImage);
        //frame.SetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

