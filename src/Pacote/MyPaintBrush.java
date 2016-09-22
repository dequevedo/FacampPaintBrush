package Pacote;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class MyPaintBrush extends JFrame{
    PaintBrushPanel panel;
    
    public MyPaintBrush(){
        this.setTitle("COM710 - L10");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.getContentPane().setLayout(new BorderLayout());
        panel = new PaintBrushPanel(this);
        this.getContentPane().add(panel);
        this.setVisible(true);
    }
    
    List<Shape> listOfShapes = new ArrayList<Shape>();
    
    void addShape(Shape s) throws TooManyShapesException{
        try{
            listOfShapes.add(s);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("erro: " + e);
        }
    }
    
    void clearAll(){
        removeAll();
        revalidate();
        repaint();
    }
    
    void moveShapes(){
        for(Shape a : listOfShapes){
            switch ((int)Random.rRangeInt(0, 4)){
                case 1 : a.moveDown();
                break;
                case 2 : a.moveUp();
                break;
                case 3 : a.moveRight();
                break;
                case 4 : a.moveLeft();
                break;
            }
        }
        revalidate();
        repaint();
    }
}
