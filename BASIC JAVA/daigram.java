import java.awt.*;
import java.applet.*;

public class daigram extends Applet {
    public void init(){
        setBackground(Color.white);
        setForeground(Color.black);
    }
    public void paint(Graphics g){
        g.drawString("Avit College", 100,100);
        g.setColor(Color.yellow);
        g.drawOval(50,60,80,90);
        g.fillOval(50,60,80,90);
        


    }
    
    
    
}
