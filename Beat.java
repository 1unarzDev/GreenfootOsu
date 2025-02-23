import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Beat extends Actor
{
    private float SCALE = 0.08f;
    private int group, time;
    
    public Beat(int group, int time, Color color){
        this.group = group;
        this.time = time;
        
        GreenfootImage img = new GreenfootImage("beat.png");
        img.setColor(color);
        img.scale((int) (this.getWorld().getWidth() * SCALE), (int) (this.getWorld().getHeight() * SCALE));
        
        this.setImage(img);
    }
    
    public void act()
    {
        
    }
}