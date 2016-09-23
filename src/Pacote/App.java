package Pacote;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws TooManyShapesException, InterruptedException  {
        MyPaintBrush paintbrush = new MyPaintBrush();
        
        int squareNum = 10;
        int circleNum = 10;
        
        for(int x = 0; x < squareNum; x++){
            paintbrush.addShape(new Square(
                Random.rRange(0,paintbrush.getWidth()),
                Random.rRange(0,paintbrush.getHeight()),
                Random.rBoolean(),
                Random.rRange(0,50),
                Random.rColor()));
        }
        
        for(int x = 0; x < circleNum; x++){
            paintbrush.addShape(new Circle(
                Random.rRange(0,paintbrush.size().width), 
                Random.rRange(0,paintbrush.size().height), 
                Random.rBoolean(), 
                Random.rRange(0,50), 
                Random.rColor()));
        }
        

        while(true){
            if(squareNum + circleNum <= 100){
                try{
                    Thread.sleep(20);
                    paintbrush.moveShapes();
                    paintbrush.repaint();
                }catch(InterruptedException ex){
                    System.out.println(ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "There are more than 100 shapes!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
