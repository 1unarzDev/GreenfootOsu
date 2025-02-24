import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.IOException;

public class Paul extends Map
{
    public Paul() throws IOException
    {
        GreenfootImage bg = new GreenfootImage("king.png");
        bg.scale(super.getWidth(), super.getHeight() );
                
        this.setBackground(bg);
        
        super.readMap("paul.txt");
    }
}
