import java.applet.Applet;
import java.awt.*;

/*<applet code="app" width="500" height="500">
</applet> */

public class app extends Applet {
    public void init(){
        setBackground(Color.BLACK);
        setForeground(Color.white);
    }
    public void paint(Graphics g){
        g.drawString("hello world", 100, 100);
        


    }
    

    
}
