import java.applet.*; 
import java.awt.*; 
  
public class AppletDemo extends Applet { 
    public void init() 
    { 
        setBackground(Color.black); 
        setForeground(Color.yellow); 
    } 
    public void paint(Graphics g) 
    { 
        g.drawString("Welcome to Applets", 50, 50);
}
}