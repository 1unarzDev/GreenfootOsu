import greenfoot.*;

public class Instructions extends World
{
    public Instructions()
    {
        super(1200, 800, 1); 
        GreenfootImage bg = new GreenfootImage("instruct.png");
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
