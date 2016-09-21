package Pacote;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
    boolean fill;
    double radius;
    Color color;

    Circle(double x, double y, boolean fill, double radius, Color color) {
        this.x = x;
        this.y = y;
        this.fill = fill;
        this.radius = radius;
        this.color = color;
    }

    @Override
    void plot(Graphics g){
        if(fill){
            g.fillOval((int)x, (int)y, (int)radius, (int)radius);
        }else{
            g.drawOval((int)x, (int)y, (int)radius, (int)radius);
        }
        g.setColor(color);
    }
}
