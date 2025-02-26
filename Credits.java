import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Credits extends World
{
    public Credits()
    {
        super(Config.getWidth(), Config.getHeight(), 1); 
        GreenfootImage bg = new GreenfootImage("credits.png");
        bg.scale(super.getWidth(), super.getHeight() );
        this.setBackground(bg);
    }
    public void act(){
        if(Greenfoot.isKeyDown("b")){
            Greenfoot.setWorld(new MainMenu());
            Greenfoot.playSound("start.wav");
        }
    }
}
