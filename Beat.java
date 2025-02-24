import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Beat extends GameObject
{
    private int group, time;
    
    public Beat(int group, int time, Color color){
        this.group = group;
        this.time = time;
        
        GreenfootImage img = new GreenfootImage("beat.png");
        img.scale(Config.getBeatSize(), Config.getBeatSize());
        // colorFilter(img, color);
        
        this.setImage(img);
    }
    
    /*
    private void colorFilter(GreenfootImage img, Color color){
        BufferedImage bimg = img.getAwtImage();
        
        
        img.dbimg.toGreenfootImage();
    }
    */
    
    public void act()
    {
        
    }
}