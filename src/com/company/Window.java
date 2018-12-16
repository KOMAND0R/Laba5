package com.company;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame
{
    private int width = 640;
    private int height = 500;

    private Image img;

    public Window()
    {
        setSize(width, height);
        setTitle("AnimationX");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void drawPicture(String src)
    {
        img = new ImageIcon(src).getImage();
        Graphics g = getGraphics();
        g.drawImage(img, 0, 0, null);
    }
}
