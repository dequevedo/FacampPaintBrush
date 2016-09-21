package Pacote;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws TooManyShapesException, InterruptedException  {
        MyPaintBrush paintbrush = new MyPaintBrush();
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insert squares amount: ");
        int squareNum = leitor.nextInt();
        System.out.println("Insert circles amount: ");
        int circleNum = leitor.nextInt();
        
        for(int x = 0; x < squareNum; x++){
            paintbrush.addShape(new Square(
                Random.rRange(0,paintbrush.size().width),
                Random.rRange(0,paintbrush.size().height),
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
            Thread.sleep(20);
                paintbrush.moveShapes();
        }
    }
    

}
