import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Map extends World
{    
    public Map()
    {    
        super(600, 400, 1);
        
        GreenfootImage bg = new GreenfootImage("king.png");
        bg.scale(super.getWidth(), super.getHeight() );
        this.setBackground(bg);
        
        Beat beat = new Beat(0, 10, new Color(255, 255, 255));
        super.addObject(beat, 100, 100);
    }
}
