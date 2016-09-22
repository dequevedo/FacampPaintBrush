package Pacote;

import java.awt.Graphics;

abstract class Shape implements Movable{
    double x;
    double y;
    
    abstract void plot(Graphics g);

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void moveLeft() {
        x--;
    }
}
