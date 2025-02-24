import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Map extends World
{    
    public Map()
    {    
        super(1200, 800, 1);
        
        GreenfootImage bg = new GreenfootImage("king.png");
        bg.scale(super.getWidth(), super.getHeight() );
        bg.setTransparency(100);
        this.setBackground(bg);
        
        //Beat beat = new Beat(0, 10, new Color(255, 0, 0));
        //super.addObject(beat, 100, 100);
    }
}
