package Pacote;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PaintBrushPanel extends JPanel{
    MyPaintBrush container;
    
    PaintBrushPanel(MyPaintBrush container){
        this.container = container;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.WHITE);
        
        for(Shape a : container.listOfShapes){
            a.plot(g);
        }
    }  
}
