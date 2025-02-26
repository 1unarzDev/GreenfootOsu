import greenfoot.*; 

public class Beat extends GameObject
{
    private int speed = Config.getBeatSpeed();
    private GreenfootSound music;
    public Beat()
    {
        GreenfootImage img = new GreenfootImage("beat.png");
        img.scale(Config.getBeatSize(), Config.getBeatSize());
        
        this.setImage(img);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + speed);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
            music = new GreenfootSound("21_wood1.wav");
        }
    }
}