package Pacote;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape{
    boolean fill;
    double sideLength;
    Color color;
    
    Square(double x, double y, boolean fill, double sideLenght, Color color){
        this.x = x;
        this.y = y;
        this.fill = fill;
        this.sideLength = sideLenght;
        this.color = color;
    }
    
    @Override
    void plot(Graphics g){
        if(fill){
            g.fillRect((int)x, (int)y, (int)sideLength, (int)sideLength);
        }else{
            g.drawRect((int)x, (int)y, (int)sideLength, (int)sideLength);
        }
        g.setColor(color);
    }
}
