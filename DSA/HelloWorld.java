// A Hello World Applet
// Save file as HelloWorld.java

import java.applet.*;
import java.awt.*;

/*
<applet code="HelloWorld" width=500 height=500>
</applet>
*/

// HelloWorld class extends Applet
public class HelloWorld extends Applet

{
	// Overriding paint() method
	public void init(){
        setBackground(Color.BLACK);
        setForeground(Color.white);
    }
	public void paint(Graphics g)
	{
		g.drawString("Hello World", 20, 20);
        g.drawRoundRect(100, 100, 50,50,50,50);
	}
	
}
