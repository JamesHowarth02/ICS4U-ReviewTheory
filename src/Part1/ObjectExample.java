package Part1;
import TurtleGraphics.*;
import java.util.concurrent.TimeUnit;

public class ObjectExample {

    public static void main(String[] args) throws InterruptedException {
        Pen p1, p2, p3;
        SketchPadWindow w = new SketchPadWindow(800, 600);
        
        /*
            All three pens can be come different types of pens.
        */
        
        p1 = new StandardPen(w);
        p2 = new WigglePen(w);
        p3 = new RainbowPen(w);
        
        p1.up();
        p1.move(-100, -100);
        p1.down();
        p1.setDirection(0);
        
        p2.up();
        p2.move(100, 100);
        p2.down();
        p2.setDirection(0);
        
        p3.up();
        p3.move(-100, 100);
        p3.down();
        p3.setDirection(0);
        
        for (double i = 0; i < 999; i = i + Math.random() * 2) {
            p1.move(i);
            p2.move(i);
            p3.move(i);
            
            p1.turn(i);
            p2.turn(i);
            p3.turn(i);
            
            TimeUnit.MILLISECONDS.sleep((int) i);
        }
        
    }
    
}
